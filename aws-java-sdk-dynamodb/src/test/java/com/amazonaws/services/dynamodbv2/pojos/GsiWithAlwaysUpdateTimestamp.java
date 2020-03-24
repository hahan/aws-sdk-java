/*
 * Copyright 2011-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.pojos;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGenerateStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedTimestamp;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Foo")
public class GsiWithAlwaysUpdateTimestamp {

    @DynamoDBHashKey
    private String hashKey;

    @DynamoDBRangeKey
    private String rangeKey;

    @DynamoDBAutoGeneratedTimestamp(strategy = DynamoDBAutoGenerateStrategy.ALWAYS)
    @DynamoDBIndexHashKey(globalSecondaryIndexName = "last-mod-date")
    private Long lastModifiedDate;

    public String getHashKey() {
        return hashKey;
    }

    public GsiWithAlwaysUpdateTimestamp setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }

    public String getRangeKey() {
        return rangeKey;
    }

    public GsiWithAlwaysUpdateTimestamp setRangeKey(String rangeKey) {
        this.rangeKey = rangeKey;
        return this;
    }

    public Long getLastModifiedDate() {
        return lastModifiedDate;
    }

    public GsiWithAlwaysUpdateTimestamp setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

}
