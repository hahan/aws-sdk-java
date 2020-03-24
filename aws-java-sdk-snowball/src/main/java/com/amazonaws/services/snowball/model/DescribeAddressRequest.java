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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/DescribeAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     */
    private String addressId;

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * 
     * @param addressId
     *        The automatically generated ID for a specific address.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * 
     * @return The automatically generated ID for a specific address.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The automatically generated ID for a specific address.
     * </p>
     * 
     * @param addressId
     *        The automatically generated ID for a specific address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressRequest withAddressId(String addressId) {
        setAddressId(addressId);
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
        if (getAddressId() != null)
            sb.append("AddressId: ").append(getAddressId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddressRequest == false)
            return false;
        DescribeAddressRequest other = (DescribeAddressRequest) obj;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddressRequest clone() {
        return (DescribeAddressRequest) super.clone();
    }

}
