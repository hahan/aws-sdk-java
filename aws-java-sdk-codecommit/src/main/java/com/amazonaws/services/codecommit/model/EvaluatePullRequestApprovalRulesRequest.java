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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/EvaluatePullRequestApprovalRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluatePullRequestApprovalRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     */
    private String pullRequestId;
    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     * request, use <a>GetPullRequest</a>.
     * </p>
     */
    private String revisionId;

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request you want to evaluate.
     */

    public void setPullRequestId(String pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     * 
     * @return The system-generated ID of the pull request you want to evaluate.
     */

    public String getPullRequestId() {
        return this.pullRequestId;
    }

    /**
     * <p>
     * The system-generated ID of the pull request you want to evaluate.
     * </p>
     * 
     * @param pullRequestId
     *        The system-generated ID of the pull request you want to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatePullRequestApprovalRulesRequest withPullRequestId(String pullRequestId) {
        setPullRequestId(pullRequestId);
        return this;
    }

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     * request, use <a>GetPullRequest</a>.
     * </p>
     * 
     * @param revisionId
     *        The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     *        request, use <a>GetPullRequest</a>.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     * request, use <a>GetPullRequest</a>.
     * </p>
     * 
     * @return The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     *         request, use <a>GetPullRequest</a>.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     * request, use <a>GetPullRequest</a>.
     * </p>
     * 
     * @param revisionId
     *        The system-generated ID for the pull request revision. To retrieve the most recent revision ID for a pull
     *        request, use <a>GetPullRequest</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluatePullRequestApprovalRulesRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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
        if (getPullRequestId() != null)
            sb.append("PullRequestId: ").append(getPullRequestId()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluatePullRequestApprovalRulesRequest == false)
            return false;
        EvaluatePullRequestApprovalRulesRequest other = (EvaluatePullRequestApprovalRulesRequest) obj;
        if (other.getPullRequestId() == null ^ this.getPullRequestId() == null)
            return false;
        if (other.getPullRequestId() != null && other.getPullRequestId().equals(this.getPullRequestId()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPullRequestId() == null) ? 0 : getPullRequestId().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public EvaluatePullRequestApprovalRulesRequest clone() {
        return (EvaluatePullRequestApprovalRulesRequest) super.clone();
    }

}
