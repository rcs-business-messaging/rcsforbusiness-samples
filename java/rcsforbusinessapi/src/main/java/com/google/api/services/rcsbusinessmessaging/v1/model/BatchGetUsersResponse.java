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
 * Response with RBM-reachability user data.
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
public final class BatchGetUsersResponse extends com.google.api.client.json.GenericJson {

  /**
   * Count of phone numbers from the randomly selected list that are RCS-reachable across all
   * carriers, regardless of the agent's launch status. The ratio between this value and
   * total_random_sample_user_count can approximate the potential reach for a list of users.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer reachableRandomSampleUserCount;

  /**
   * List of users' phone numbers that RBM can reach. Only includes users on carriers that the agent
   * is launched on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reachableUsers;

  /**
   * Count of phone numbers randomly selected from reachable_users. Typically, this value is ~75% of
   * the total requested phone numbers. This value is `0` if the count of requested phone numbers is
   * less than 500.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalRandomSampleUserCount;

  /**
   * Count of phone numbers from the randomly selected list that are RCS-reachable across all
   * carriers, regardless of the agent's launch status. The ratio between this value and
   * total_random_sample_user_count can approximate the potential reach for a list of users.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReachableRandomSampleUserCount() {
    return reachableRandomSampleUserCount;
  }

  /**
   * Count of phone numbers from the randomly selected list that are RCS-reachable across all
   * carriers, regardless of the agent's launch status. The ratio between this value and
   * total_random_sample_user_count can approximate the potential reach for a list of users.
   * @param reachableRandomSampleUserCount reachableRandomSampleUserCount or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BatchGetUsersResponse setReachableRandomSampleUserCount(java.lang.Integer reachableRandomSampleUserCount) {
    this.reachableRandomSampleUserCount = reachableRandomSampleUserCount;
    return this;
  }

  /**
   * List of users' phone numbers that RBM can reach. Only includes users on carriers that the agent
   * is launched on.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReachableUsers() {
    return reachableUsers;
  }

  /**
   * List of users' phone numbers that RBM can reach. Only includes users on carriers that the agent
   * is launched on.
   * @param reachableUsers reachableUsers or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BatchGetUsersResponse setReachableUsers(java.util.List<java.lang.String> reachableUsers) {
    this.reachableUsers = reachableUsers;
    return this;
  }

  /**
   * Count of phone numbers randomly selected from reachable_users. Typically, this value is ~75% of
   * the total requested phone numbers. This value is `0` if the count of requested phone numbers is
   * less than 500.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalRandomSampleUserCount() {
    return totalRandomSampleUserCount;
  }

  /**
   * Count of phone numbers randomly selected from reachable_users. Typically, this value is ~75% of
   * the total requested phone numbers. This value is `0` if the count of requested phone numbers is
   * less than 500.
   * @param totalRandomSampleUserCount totalRandomSampleUserCount or {@code null} for none
   */
  @com.google.errorprone.annotations.CanIgnoreReturnValue
  public BatchGetUsersResponse setTotalRandomSampleUserCount(java.lang.Integer totalRandomSampleUserCount) {
    this.totalRandomSampleUserCount = totalRandomSampleUserCount;
    return this;
  }

  @Override
  public BatchGetUsersResponse set(String fieldName, Object value) {
    return (BatchGetUsersResponse) super.set(fieldName, value);
  }

  @Override
  public BatchGetUsersResponse clone() {
    return (BatchGetUsersResponse) super.clone();
  }

}
