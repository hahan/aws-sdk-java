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
package com.amazonaws.services.elasticache.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * PurchaseReservedCacheNodesOfferingRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedCacheNodesOfferingRequestMarshaller implements
        Marshaller<Request<PurchaseReservedCacheNodesOfferingRequest>, PurchaseReservedCacheNodesOfferingRequest> {

    public Request<PurchaseReservedCacheNodesOfferingRequest> marshall(PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) {

        if (purchaseReservedCacheNodesOfferingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PurchaseReservedCacheNodesOfferingRequest> request = new DefaultRequest<PurchaseReservedCacheNodesOfferingRequest>(
                purchaseReservedCacheNodesOfferingRequest, "AmazonElastiCache");
        request.addParameter("Action", "PurchaseReservedCacheNodesOffering");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (purchaseReservedCacheNodesOfferingRequest.getReservedCacheNodesOfferingId() != null) {
            request.addParameter("ReservedCacheNodesOfferingId",
                    StringUtils.fromString(purchaseReservedCacheNodesOfferingRequest.getReservedCacheNodesOfferingId()));
        }

        if (purchaseReservedCacheNodesOfferingRequest.getReservedCacheNodeId() != null) {
            request.addParameter("ReservedCacheNodeId", StringUtils.fromString(purchaseReservedCacheNodesOfferingRequest.getReservedCacheNodeId()));
        }

        if (purchaseReservedCacheNodesOfferingRequest.getCacheNodeCount() != null) {
            request.addParameter("CacheNodeCount", StringUtils.fromInteger(purchaseReservedCacheNodesOfferingRequest.getCacheNodeCount()));
        }

        return request;
    }

}
