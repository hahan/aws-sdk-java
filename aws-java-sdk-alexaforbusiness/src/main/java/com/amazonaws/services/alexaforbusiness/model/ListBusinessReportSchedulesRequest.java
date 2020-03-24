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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ListBusinessReportSchedules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBusinessReportSchedulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of schedules listed in the call.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token used to list the remaining schedules from the previous API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     * 
     * @return The token used to list the remaining schedules from the previous API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token used to list the remaining schedules from the previous API call.
     * </p>
     * 
     * @param nextToken
     *        The token used to list the remaining schedules from the previous API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBusinessReportSchedulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of schedules listed in the call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of schedules listed in the call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of schedules listed in the call.
     * </p>
     * 
     * @return The maximum number of schedules listed in the call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of schedules listed in the call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of schedules listed in the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBusinessReportSchedulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBusinessReportSchedulesRequest == false)
            return false;
        ListBusinessReportSchedulesRequest other = (ListBusinessReportSchedulesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListBusinessReportSchedulesRequest clone() {
        return (ListBusinessReportSchedulesRequest) super.clone();
    }

}
