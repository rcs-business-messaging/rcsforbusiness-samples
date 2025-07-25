# RCS Business Messaging: Your First Agent

This sample RBM agent demonstrates how to use the RBM Csharp SDK to
send messages to an RCS-enabled device. In this simple example, we do
not receive notifications from the user which would require a webhook.

## Prerequisites

You must have the following software installed on your development machine:

* Dotnet SDK version 8.0

This SDK can be downloaded from https://dotnet.microsoft.com/en-us/download.

## Setup

Prepare credentials:

1.  Open the [RBM Developer Console](https://business-communications.cloud.google.com/console/partner-console/)
    with your RBM Platform Google account and create a new RBM agent.

2.  In the top bar, select the **Settings** icon.

3.  In the left navigation, click **Service account**.

4.  Click **Create key**. Your browser downloads a service account key for your agent.
    You need this to run this example.

## Invite your test device

1. In a terminal, navigate to this sample's root directory.

2. Run the following commands:

```
   dotnet build
   dotnet run PATH_TO_SERVICE_ACCOUNT_KEY AGENTID PHONE_NUMBER invite
```

Replace the `PATH_TO_SERVICE_ACCOUNT_KEY` with the location of the service account key
file you downloaded.

The "invite" text at the end of this command sends `PHONE_NUMBER` an invite to
become a tester for your agent.
  
## Send a message

1. In a terminal, navigate to this sample's root directory.

2. Run the following commands:

```
   dotnet build
   donet run PATH_TO_SERVICE_ACCOUNT_KEY AGENTID PHONE_NUMBER chat
```
