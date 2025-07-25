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
 * The content of a message sent from the agent to a user.
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
public final class AgentContentMessage extends com.google.api.client.json.GenericJson {

  /**
   * Information about a file, including the URL of the file and the URL of the file’s thumbnail.
   * The RBM platform serves content from a cache, but an agent can force the RBM platform to fetch
   * a new version of the content and refresh the cache.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContentInfo contentInfo;

  /**
   * The unique name of a file. The RBM platform returns a file name when an agent uploads a file.
   * Deprecated in favor of uploaded_rbm_file below
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileName;

  /**
   * A standalone rich card.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RichCard richCard;

  /**
   * A list of suggested replies and suggested actions that appear as a list of suggestion chips
   * following the associated agent message. Maximum 11 suggestions. The chips only display when the
   * associated agent message is the most recent message within the conversation (including both
   * agent and user messages). The user can tap a suggested reply to send the text reply back to the
   * agent or tap a suggested action to initiate a native action on the device. Maximum 11
   * suggestions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Suggestion> suggestions;

  /**
   * Text encoded in UTF-8. Maximum 3072 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Contains identifiers for a file and thumbnail that were uploaded to and served by the RBM
   * server
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UploadedRbmFile uploadedRbmFile;

  /**
   * Information about a file, including the URL of the file and the URL of the file’s thumbnail.
   * The RBM platform serves content from a cache, but an agent can force the RBM platform to fetch
   * a new version of the content and refresh the cache.
   * @return value or {@code null} for none
   */
  public ContentInfo getContentInfo() {
    return contentInfo;
  }

  /**
   * Information about a file, including the URL of the file and the URL of the file’s thumbnail.
   * The RBM platform serves content from a cache, but an agent can force the RBM platform to fetch
   * a new version of the content and refresh the cache.
   * @param contentInfo contentInfo or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public AgentContentMessage setContentInfo(ContentInfo contentInfo) {
    this.contentInfo = contentInfo;
    return this;
  }

  /**
   * The unique name of a file. The RBM platform returns a file name when an agent uploads a file.
   * Deprecated in favor of uploaded_rbm_file below
   * @return value or {@code null} for none
   */
  public java.lang.String getFileName() {
    return fileName;
  }

  /**
   * The unique name of a file. The RBM platform returns a file name when an agent uploads a file.
   * Deprecated in favor of uploaded_rbm_file below
   * @param fileName fileName or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public AgentContentMessage setFileName(java.lang.String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * A standalone rich card.
   * @return value or {@code null} for none
   */
  public RichCard getRichCard() {
    return richCard;
  }

  /**
   * A standalone rich card.
   * @param richCard richCard or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public AgentContentMessage setRichCard(RichCard richCard) {
    this.richCard = richCard;
    return this;
  }

  /**
   * A list of suggested replies and suggested actions that appear as a list of suggestion chips
   * following the associated agent message. Maximum 11 suggestions. The chips only display when the
   * associated agent message is the most recent message within the conversation (including both
   * agent and user messages). The user can tap a suggested reply to send the text reply back to the
   * agent or tap a suggested action to initiate a native action on the device. Maximum 11
   * suggestions.
   * @return value or {@code null} for none
   */
  public java.util.List<Suggestion> getSuggestions() {
    return suggestions;
  }

  /**
   * A list of suggested replies and suggested actions that appear as a list of suggestion chips
   * following the associated agent message. Maximum 11 suggestions. The chips only display when the
   * associated agent message is the most recent message within the conversation (including both
   * agent and user messages). The user can tap a suggested reply to send the text reply back to the
   * agent or tap a suggested action to initiate a native action on the device. Maximum 11
   * suggestions.
   * @param suggestions suggestions or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public AgentContentMessage setSuggestions(java.util.List<Suggestion> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * Text encoded in UTF-8. Maximum 3072 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text encoded in UTF-8. Maximum 3072 characters.
   * @param text text or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public AgentContentMessage setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * Contains identifiers for a file and thumbnail that were uploaded to and served by the RBM
   * server
   * @return value or {@code null} for none
   */
  public UploadedRbmFile getUploadedRbmFile() {
    return uploadedRbmFile;
  }

  /**
   * Contains identifiers for a file and thumbnail that were uploaded to and served by the RBM
   * server
   * @param uploadedRbmFile uploadedRbmFile or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public AgentContentMessage setUploadedRbmFile(UploadedRbmFile uploadedRbmFile) {
    this.uploadedRbmFile = uploadedRbmFile;
    return this;
  }

  @Override
  public AgentContentMessage set(String fieldName, Object value) {
    return (AgentContentMessage) super.set(fieldName, value);
  }

  @Override
  public AgentContentMessage clone() {
    return (AgentContentMessage) super.clone();
  }

}
