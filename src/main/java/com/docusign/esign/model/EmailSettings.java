package com.docusign.esign.model;

import java.util.Objects;
import com.docusign.esign.model.BccEmailAddress;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent.   When the emailSettings information is used for an envelope, it only applies to that envelope.   **IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings.   EmailSettings consists of:   * replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters. * replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters. * bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option.  DocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters. *Example*: if your account has BCC for Email Archive set up for the email address ‘archive@mycompany.com’ and you send an envelope using the BCC Email Override to send a BCC email to ‘salesarchive@mycompany.com’, then a copy of the envelope is only sent to the ‘salesarchive@mycompany.com’ email address.
 */
@ApiModel(description = "A complex element that allows  the sender to override some envelope email setting information. This can be used to override the Reply To email address and name associated with the envelope and to override the BCC email addresses to which an envelope is sent.   When the emailSettings information is used for an envelope, it only applies to that envelope.   **IMPORTANT**: The emailSettings information is not returned in the GET for envelope status. Use GET /email_settings to return information about the emailSettings.   EmailSettings consists of:   * replyEmailAddressOverride - The Reply To email used for the envelope. DocuSign will verify that a correct email format is used, but does not verify that the email is active. Maximum Length: 100 characters. * replyEmailNameOverride - The name associated with the Reply To email address. Maximum Length: 100 characters. * bccEmailAddresses - An array of up to five email addresses to which the envelope is sent to as a BCC email. Only users with canManageAccount setting set to true can use this option.  DocuSign verifies that the email format is correct, but does not verify that the email is active. Using this overrides the BCC for Email Archive information setting for this envelope. Maximum Length: 100 characters. *Example*: if your account has BCC for Email Archive set up for the email address ‘archive@mycompany.com’ and you send an envelope using the BCC Email Override to send a BCC email to ‘salesarchive@mycompany.com’, then a copy of the envelope is only sent to the ‘salesarchive@mycompany.com’ email address.")

public class EmailSettings {
  @JsonProperty("bccEmailAddresses")
  private java.util.List<BccEmailAddress> bccEmailAddresses = new java.util.ArrayList<BccEmailAddress>();

  @JsonProperty("replyEmailAddressOverride")
  private String replyEmailAddressOverride = null;

  @JsonProperty("replyEmailNameOverride")
  private String replyEmailNameOverride = null;

  public EmailSettings bccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
    return this;
  }

  public EmailSettings addBccEmailAddressesItem(BccEmailAddress bccEmailAddressesItem) {
    this.bccEmailAddresses.add(bccEmailAddressesItem);
    return this;
  }

   /**
   * A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.
   * @return bccEmailAddresses
  **/
  @ApiModelProperty(example = "null", value = "A list of email addresses that receive a copy of all email communications for an envelope. You can use this for archiving purposes.")
  public java.util.List<BccEmailAddress> getBccEmailAddresses() {
    return bccEmailAddresses;
  }

  public void setBccEmailAddresses(java.util.List<BccEmailAddress> bccEmailAddresses) {
    this.bccEmailAddresses = bccEmailAddresses;
  }

  public EmailSettings replyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
    return this;
  }

   /**
   * 
   * @return replyEmailAddressOverride
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReplyEmailAddressOverride() {
    return replyEmailAddressOverride;
  }

  public void setReplyEmailAddressOverride(String replyEmailAddressOverride) {
    this.replyEmailAddressOverride = replyEmailAddressOverride;
  }

  public EmailSettings replyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
    return this;
  }

   /**
   * 
   * @return replyEmailNameOverride
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReplyEmailNameOverride() {
    return replyEmailNameOverride;
  }

  public void setReplyEmailNameOverride(String replyEmailNameOverride) {
    this.replyEmailNameOverride = replyEmailNameOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSettings emailSettings = (EmailSettings) o;
    return Objects.equals(this.bccEmailAddresses, emailSettings.bccEmailAddresses) &&
        Objects.equals(this.replyEmailAddressOverride, emailSettings.replyEmailAddressOverride) &&
        Objects.equals(this.replyEmailNameOverride, emailSettings.replyEmailNameOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bccEmailAddresses, replyEmailAddressOverride, replyEmailNameOverride);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSettings {\n");
    
    sb.append("    bccEmailAddresses: ").append(toIndentedString(bccEmailAddresses)).append("\n");
    sb.append("    replyEmailAddressOverride: ").append(toIndentedString(replyEmailAddressOverride)).append("\n");
    sb.append("    replyEmailNameOverride: ").append(toIndentedString(replyEmailNameOverride)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

