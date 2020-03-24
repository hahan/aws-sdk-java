/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A domain that is used to redirect email recipients to an Amazon SES-operated domain. This domain captures open and
 * click events generated by Amazon SES emails.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/ses/latest/DeveloperGuide/configure-custom-open-click-domains.html">Configuring
 * Custom Domains to Handle Open and Click Tracking</a> in the <i>Amazon SES Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/TrackingOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackingOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
     * </p>
     */
    private String customRedirectDomain;

    /**
     * <p>
     * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
     * </p>
     * 
     * @param customRedirectDomain
     *        The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking
     *        domain.
     */

    public void setCustomRedirectDomain(String customRedirectDomain) {
        this.customRedirectDomain = customRedirectDomain;
    }

    /**
     * <p>
     * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
     * </p>
     * 
     * @return The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking
     *         domain.
     */

    public String getCustomRedirectDomain() {
        return this.customRedirectDomain;
    }

    /**
     * <p>
     * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
     * </p>
     * 
     * @param customRedirectDomain
     *        The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking
     *        domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackingOptions withCustomRedirectDomain(String customRedirectDomain) {
        setCustomRedirectDomain(customRedirectDomain);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomRedirectDomain() != null)
            sb.append("CustomRedirectDomain: ").append(getCustomRedirectDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackingOptions == false)
            return false;
        TrackingOptions other = (TrackingOptions) obj;
        if (other.getCustomRedirectDomain() == null ^ this.getCustomRedirectDomain() == null)
            return false;
        if (other.getCustomRedirectDomain() != null && other.getCustomRedirectDomain().equals(this.getCustomRedirectDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomRedirectDomain() == null) ? 0 : getCustomRedirectDomain().hashCode());
        return hashCode;
    }

    @Override
    public TrackingOptions clone() {
        try {
            return (TrackingOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
