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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteLocalGatewayRouteRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteLocalGatewayRouteRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteLocalGatewayRouteRequest> {

    /**
     * <p>
     * The CIDR range for the route. This must match the CIDR for the route exactly.
     * </p>
     */
    private String destinationCidrBlock;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;

    /**
     * <p>
     * The CIDR range for the route. This must match the CIDR for the route exactly.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR range for the route. This must match the CIDR for the route exactly.
     */

    public void setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR range for the route. This must match the CIDR for the route exactly.
     * </p>
     * 
     * @return The CIDR range for the route. This must match the CIDR for the route exactly.
     */

    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * <p>
     * The CIDR range for the route. This must match the CIDR for the route exactly.
     * </p>
     * 
     * @param destinationCidrBlock
     *        The CIDR range for the route. This must match the CIDR for the route exactly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLocalGatewayRouteRequest withDestinationCidrBlock(String destinationCidrBlock) {
        setDestinationCidrBlock(destinationCidrBlock);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteLocalGatewayRouteRequest withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteLocalGatewayRouteRequest> getDryRunRequest() {
        Request<DeleteLocalGatewayRouteRequest> request = new DeleteLocalGatewayRouteRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDestinationCidrBlock() != null)
            sb.append("DestinationCidrBlock: ").append(getDestinationCidrBlock()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLocalGatewayRouteRequest == false)
            return false;
        DeleteLocalGatewayRouteRequest other = (DeleteLocalGatewayRouteRequest) obj;
        if (other.getDestinationCidrBlock() == null ^ this.getDestinationCidrBlock() == null)
            return false;
        if (other.getDestinationCidrBlock() != null && other.getDestinationCidrBlock().equals(this.getDestinationCidrBlock()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationCidrBlock() == null) ? 0 : getDestinationCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLocalGatewayRouteRequest clone() {
        return (DeleteLocalGatewayRouteRequest) super.clone();
    }
}
