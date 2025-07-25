/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.rcsbusinessmessaging.v1.model;

/**
 * A file resource with a unique name that an agent can use to identify the file when sending
 * messages.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the RCS Business Messaging API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class File extends com.google.api.client.json.GenericJson {

  /**
   * Server-assigned unique name of the file resource, which an agent can use to identify the file
   * when sending messages. The format is "files/{uid}", where {uid} is a unique ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Server-assigned unique name of the file resource, which an agent can use to identify the file
   * when sending messages. The format is "files/{uid}", where {uid} is a unique ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Server-assigned unique name of the file resource, which an agent can use to identify the file
   * when sending messages. The format is "files/{uid}", where {uid} is a unique ID.
   * @param name name or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public File setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public File set(String fieldName, Object value) {
    return (File) super.set(fieldName, value);
  }

  @Override
  public File clone() {
    return (File) super.clone();
  }

}
