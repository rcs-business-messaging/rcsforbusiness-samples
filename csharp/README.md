# RCS for Business - Csharp samples

This folder contains code to help you call the Google RCS for Business API in Csharp.

All the code is built with Dotnet SDK v8. More information about this can be found at
https://dotnet.microsoft.com/en-us/download.

## RCS for Business API

In the `rcsforbusinessapi/` folder you will find the source and project file that we generate from
the RBM API definition. This will be updated as new functionality is added to the API.

We also plan to publish releases to [nuget.org](https://nuget.org/`) and will update our documentation accordingly once
we do that.

## The demise of rbm-api-helper

Previously we have maintained a wrapper around the generated API which we referred to as the
'RBM API Helper'. Its purpose was to assist developers who were starting out by making it simple to
invoke RBM API calls. However, it hid a lot of the flexibility of the RBM API in order to achieve this.

As the RBM ecosystem has matured, developers have moved beyond wanting to send simple RBM messages and
require access to the full RBM API. On this basis, we have taken the decision to no longer maintain the 
RBM API Helper and to focus on explaining the full API directly.

The source code for the RBM Helper API is available in [our old repo](https://github.com/rcs-business-messaging/rbm-api-examples/tree/master/csharp/rbm-api-helper) and you are free to read it to
explore how to call the uderlying API.

We took forward to continuing to support the RBM ecosystem!

The Google RBM Developer Relations team.

rbm-devrel@google.com