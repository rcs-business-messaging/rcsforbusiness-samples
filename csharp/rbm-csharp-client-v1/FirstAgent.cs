using Google.Apis.Auth.OAuth2;
using Google.Apis.Services;
using Google.Apis.RCSBusinessMessaging.v1;
using Google.Apis.RCSBusinessMessaging.v1.Data;

using Newtonsoft.Json.Linq;

namespace rbm_csharp_client_v1
{
    
    /// <summary>
    /// RCS Business Messaging sample first agent.
    ///
    /// Sends the following message to a user: "What is your favorite color?"
    /// Does not wait for a response - the RBM Partner Model does not support PubSub 
    /// - you must now use webhooks.
    /// </summary>
    class FirstAgent
    {
        private const string AUTH_SCOPE = "https://www.googleapis.com/auth/rcsbusinessmessaging";

        // the phone number, in E.164 format, to start a conversation with
        private string msisdn;
    
        // The RBM agent id (without the @rbm.goog domain suffix)
        private string agentId;

        // Handle to the RBM API
        private RCSBusinessMessagingService rcsBusinessMessagingService;

        /// <summary>
        /// Initializes a new instance of the <see cref="T:rbm_csharp_client_v1.FirstAgent"/> class.
        /// </summary>
        /// <param name="credentialsFileLocation">The service credentials file location.</param>
        /// <param name="msisdn">The client msisdn in E.164 format.</param>
        /// <param name="agentId">RBM agent id (without the '@rbm.goog').</param>
        public FirstAgent(string credentialsFileLocation,
                          string msisdn, string agentId)
        {
            this.msisdn = msisdn;
            this.agentId = agentId;

            string[] scopes = new string[] { AUTH_SCOPE };

            GoogleCredential credential;
            using (var stream = new FileStream(credentialsFileLocation,
                                               FileMode.Open, FileAccess.Read))
            {
                credential = GoogleCredential.FromStream(stream)
                                             .CreateScoped(scopes);
            }

            this.rcsBusinessMessagingService = new RCSBusinessMessagingService(new BaseClientService.Initializer()
            {
                HttpClientInitializer = credential
            });
        }

        /// <summary>
        /// Sends the initial greeting of "What is your favorite color?" to the user.
        /// </summary>
        public void SendGreeting()
        {
            string messageText = "What is your favorite color?";

            Console.WriteLine("Sending greeting to " + this.msisdn);

            AgentContentMessage contentMessage = new AgentContentMessage();
            contentMessage.Text = messageText;

            AgentMessage agentMessage = new AgentMessage();
            agentMessage.ContentMessage = contentMessage;

            PhonesResource.AgentMessagesResource.CreateRequest request
                = rcsBusinessMessagingService.Phones.AgentMessages.Create(agentMessage, "phones/" + this.msisdn);

            request.MessageId = System.Guid.NewGuid().ToString();
            request.AgentId = this.agentId;

            request.Execute();
        }

        /// <summary>
        /// Sends a user an invite to test this agent.
        /// </summary>
        public void SendTesterInvite()
        {
            string phoneNumber = "phones/" + this.msisdn; 

            Tester tester = new Tester();

            PhonesResource.TestersResource.CreateRequest request
                = rcsBusinessMessagingService.Phones.Testers.Create(tester, phoneNumber);

            request.AgentId = this.agentId;
            request.Execute();
        }

        /// <summary>
        /// Sends the client device a capability check.
        /// </summary>
        public void SendCapabilityCheck()
        {
            string phoneNumber = "phones/" + this.msisdn;

            PhonesResource.GetCapabilitiesRequest request
                = rcsBusinessMessagingService.Phones.GetCapabilities(phoneNumber);

            request.RequestId = System.Guid.NewGuid().ToString();
            request.AgentId = this.agentId;

            Capabilities capabilities = null;
            try
            {
                capabilities = request.Execute();

                foreach (string feature in capabilities.Features)
                {
                    Console.WriteLine(feature);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }

        static void Main(string[] args)
        {
            // make sure we have command line arguments
            if (args.Length != 3 && args.Length != 4)
            {
                Console.WriteLine("Usage:  " +
                        "<SERVICE_ACCOUNT.json> <AGENT ID> <PHONE E.164> <MODE>");

                Environment.Exit(0);
            }

            string credentialsFileLocation = args[0];
            string agentId = args[1];
            string msisdn = args[2];

            string mode = "chat";

            // check if a mode was passed in
            if (args.Length > 3)
            {
                mode = args[3];
            }

            // create a reference of the agent
            FirstAgent firstAgent = new FirstAgent(credentialsFileLocation,
                                                   msisdn, agentId);

            // execute the method corresponding with the mode
            if (mode.Equals("chat"))
            {
                firstAgent.SendGreeting();
            }
            else if (mode.Equals("capcheck"))
            {
                Console.WriteLine("sending capability check");
                firstAgent.SendCapabilityCheck();
            }
            else if (mode.Equals("invite"))
            {
                Console.WriteLine("sending tester invite");
                firstAgent.SendTesterInvite();
            }
            else
            {
                Console.WriteLine("Invalid mode. Must be one of chat, capcheck, or invite.");
            }
        }
    }
}
