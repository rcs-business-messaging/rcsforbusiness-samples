# RCS for Business - Java samples

This folder contains code to help you call the Google RCS for Business API in Java.

## RCS for Business API

In the `rcsforbusinessapi/` folder you will find the source and project file that we generate from
the RBM API definition. This will be updated as new functionality is added to the API.

This library is published to [Maven Central](https://central.sonatype.com/artifact/com.google.rbm/rcsbusinessmessaging)
as changes occur.

## The demise of rbm-api-helper

Previously we have maintained a wrapper around the generated API which we referred to as the
'RBM API Helper'. Its purpose was to assist developers who were starting out by making it simple to
invoke RBM API calls. However, it hid a lot of the flexibility of the RBM API in order to achieve this.

As the RBM ecosystem has matured, developers have moved beyond wanting to send simple RBM messages and
require access to the full RBM API. On this basis, we have taken the decision to no longer maintain the 
RBM API Helper and to focus on explaining the full API directly.

The source code for the RBM Helper API is available in [our old repo](https://github.com/rcs-business-messaging/rbm-api-examples/tree/master/java/rbm-api-helper) and you are free to read it to explore how to call the underlying API.

We look forward to continuing to support the RBM ecosystem!

The Google RBM Developer Relations team.

rbm-devrel@google.com