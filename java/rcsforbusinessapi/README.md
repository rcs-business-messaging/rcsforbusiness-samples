# RCS for Business API

This library provides a Java implementation for calling the Google
[RCS for Business API](https://developers.google.com/business-communications/rcs-business-messaging/reference/rest).

## Maven usage

If you need to build a Java application that uses this library
directly then we recommend you use the latest version available
in the Maven repositories. Add the following to you `pom.xml`:

```
<dependency>
  <groupId>com.google.rbm</groupId>
  <artifactId>rcsbusinessmessaging</artifactId>
  <version>1.0.3</version>
</dependency>
```

Update for the latest version - visit [Maven Central](https://central.sonatype.com/artifact/com.google.rbm/rcsbusinessmessaging/overview).


## Overriding the service URL

The default library behaviour is to use the global API entry point which is
`https://rcsbusinessmessaging.googleapis.com/`. For optimal performance,
our recommendation is to use the regional API entry point closest to where your
code is located. These entry points are:

- **Europe**: `https://europe-rcsbusinessmessaging.googleapis.com/`
- **US**: `https://us-rcsbusinessmessaging.googleapis.com/`
- **APAC**: `https://asia-rcsbusinessmessaging.googleapis.com/`

The entry point can be set at library initialisation time like this:

```
String apiUrl = "https://asia-rcsbusinessmessaging.googleapis.com/";

try {
  HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
  GsonFactory gsonFactory = GsonFactory.getDefaultInstance();

  // create instance of the RBM API
  builder = new RCSBusinessMessaging
    .Builder(httpTransport, gsonFactory, null)
    .setApplicationName(((ServiceAccountCredentials) credentials).getProjectId());

  // set the API credentials and endpoint
  builder.setHttpRequestInitializer(new HttpCredentialsAdapter(credentials));
  builder.setRootUrl(apiUrl);
} catch(Exception e) {
  logger.log(Level.SEVERE, EXCEPTION_WAS_THROWN, e);
}
```

## Local usage

You can build and install a local version with:

```
mvn install
```

## Change log

1.0.3

- Regenerated to include RCS for Business API definitions as of June 17th 2025.
- Renaming from RCS Business Messaging to RCS for Business.
- Change to package structure to align with new generator format. The base
  package is now `com.google.api.services.rcsbusinessmessaging.v1`.

1.0.2

- Regen to match current RBM product API (including message type)
- IMPORT - note change is root classpath to `com.google.rcsbusinessmessaging.v1`.
  You will need to edit `import` statements in your code to match
  (our [example](https://github.com/rcs-business-messaging/rbm-api-examples/tree/master/java/rbm-intro-lowlevel)
  has been updated).

1.0.1

- Added support for `ComposeAction`, `ComposeRecordingMessage` and `ComposeTextMessage`.
- Added size limits and improved comments.

1.0.0 

- First release
