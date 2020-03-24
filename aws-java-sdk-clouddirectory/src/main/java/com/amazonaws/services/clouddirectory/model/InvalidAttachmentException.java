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
package com.amazonaws.services.clouddirectory.model;

import javax.annotation.Generated;

/**
 * <p>
 * Indicates that an attempt to make an attachment was invalid. For example, attaching two nodes with a link type that
 * is not applicable to the nodes or attempting to apply a schema to a directory a second time.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidAttachmentException extends com.amazonaws.services.clouddirectory.model.AmazonCloudDirectoryException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidAttachmentException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidAttachmentException(String message) {
        super(message);
    }

}
