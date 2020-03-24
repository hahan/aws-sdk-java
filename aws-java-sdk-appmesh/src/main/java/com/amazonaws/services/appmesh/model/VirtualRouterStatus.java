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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the status of a virtual router.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualRouterStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualRouterStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the virtual router.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The current status of the virtual router.
     * </p>
     * 
     * @param status
     *        The current status of the virtual router.
     * @see VirtualRouterStatusCode
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the virtual router.
     * </p>
     * 
     * @return The current status of the virtual router.
     * @see VirtualRouterStatusCode
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the virtual router.
     * </p>
     * 
     * @param status
     *        The current status of the virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualRouterStatusCode
     */

    public VirtualRouterStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the virtual router.
     * </p>
     * 
     * @param status
     *        The current status of the virtual router.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualRouterStatusCode
     */

    public VirtualRouterStatus withStatus(VirtualRouterStatusCode status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualRouterStatus == false)
            return false;
        VirtualRouterStatus other = (VirtualRouterStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public VirtualRouterStatus clone() {
        try {
            return (VirtualRouterStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualRouterStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
