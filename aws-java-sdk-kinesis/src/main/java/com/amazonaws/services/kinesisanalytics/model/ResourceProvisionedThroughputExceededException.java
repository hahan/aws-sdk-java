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
package com.amazonaws.services.kinesisanalytics.model;

import javax.annotation.Generated;

/**
 * <p>
 * Discovery failed to get a record from the streaming source because of the Amazon Kinesis Streams
 * ProvisionedThroughputExceededException. For more information, see <a
 * href="https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html">GetRecords</a> in the Amazon
 * Kinesis Streams API Reference.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceProvisionedThroughputExceededException extends com.amazonaws.services.kinesisanalytics.model.AmazonKinesisAnalyticsException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceProvisionedThroughputExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ResourceProvisionedThroughputExceededException(String message) {
        super(message);
    }

}
