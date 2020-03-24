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
package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.Node;
import javax.annotation.Generated;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.transform.StandardErrorUnmarshaller;

import com.amazonaws.services.rds.model.ReservedDBInstanceAlreadyExistsException;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedDBInstanceAlreadyExistsExceptionUnmarshaller extends StandardErrorUnmarshaller {

    public ReservedDBInstanceAlreadyExistsExceptionUnmarshaller() {
        super(ReservedDBInstanceAlreadyExistsException.class);
    }

    @Override
    public AmazonServiceException unmarshall(Node node) throws Exception {
        // Bail out if this isn't the right error code that this
        // marshaller understands
        String errorCode = parseErrorCode(node);
        if (errorCode == null || !errorCode.equals("ReservedDBInstanceAlreadyExists"))
            return null;

        ReservedDBInstanceAlreadyExistsException e = (ReservedDBInstanceAlreadyExistsException) super.unmarshall(node);

        return e;
    }
}
