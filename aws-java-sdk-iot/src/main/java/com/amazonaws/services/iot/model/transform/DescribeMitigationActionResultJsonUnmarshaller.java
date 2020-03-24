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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeMitigationActionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMitigationActionResultJsonUnmarshaller implements Unmarshaller<DescribeMitigationActionResult, JsonUnmarshallerContext> {

    public DescribeMitigationActionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMitigationActionResult describeMitigationActionResult = new DescribeMitigationActionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeMitigationActionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actionName", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionType", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionArn", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setActionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionId", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionParams", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setActionParams(MitigationActionParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    context.nextToken();
                    describeMitigationActionResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeMitigationActionResult;
    }

    private static DescribeMitigationActionResultJsonUnmarshaller instance;

    public static DescribeMitigationActionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMitigationActionResultJsonUnmarshaller();
        return instance;
    }
}
