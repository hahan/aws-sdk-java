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
package com.amazonaws.services.frauddetector.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.frauddetector.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelVersionDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelVersionDetailMarshaller {

    private static final MarshallingInfo<String> MODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelId").build();
    private static final MarshallingInfo<String> MODELTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("modelType").build();
    private static final MarshallingInfo<String> MODELVERSIONNUMBER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelVersionNumber").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<StructuredPojo> TRAININGDATASOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trainingDataSource").build();
    private static final MarshallingInfo<List> MODELVARIABLES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("modelVariables").build();
    private static final MarshallingInfo<StructuredPojo> LABELSCHEMA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("labelSchema").build();
    private static final MarshallingInfo<Map> VALIDATIONMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("validationMetrics").build();
    private static final MarshallingInfo<Map> TRAININGMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("trainingMetrics").build();
    private static final MarshallingInfo<String> LASTUPDATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastUpdatedTime").build();
    private static final MarshallingInfo<String> CREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdTime").build();

    private static final ModelVersionDetailMarshaller instance = new ModelVersionDetailMarshaller();

    public static ModelVersionDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelVersionDetail modelVersionDetail, ProtocolMarshaller protocolMarshaller) {

        if (modelVersionDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelVersionDetail.getModelId(), MODELID_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getModelType(), MODELTYPE_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getModelVersionNumber(), MODELVERSIONNUMBER_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getTrainingDataSource(), TRAININGDATASOURCE_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getModelVariables(), MODELVARIABLES_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getLabelSchema(), LABELSCHEMA_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getValidationMetrics(), VALIDATIONMETRICS_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getTrainingMetrics(), TRAININGMETRICS_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getLastUpdatedTime(), LASTUPDATEDTIME_BINDING);
            protocolMarshaller.marshall(modelVersionDetail.getCreatedTime(), CREATEDTIME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
