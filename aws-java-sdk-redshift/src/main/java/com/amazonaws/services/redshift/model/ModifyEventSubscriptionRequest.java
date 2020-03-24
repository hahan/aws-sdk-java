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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifyEventSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyEventSubscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the modified Amazon Redshift event notification subscription.
     * </p>
     */
    private String subscriptionName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and scheduled-action.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceIds;
    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;
    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     */
    private String severity;
    /**
     * <p>
     * A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     * enabled
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the modified Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the modified Amazon Redshift event notification subscription.
     */

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the modified Amazon Redshift event notification subscription.
     * </p>
     * 
     * @return The name of the modified Amazon Redshift event notification subscription.
     */

    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * <p>
     * The name of the modified Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param subscriptionName
     *        The name of the modified Amazon Redshift event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        setSubscriptionName(subscriptionName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the SNS topic to be used by the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and scheduled-action.
     * </p>
     * 
     * @param sourceType
     *        The type of source that will be generating the events. For example, if you want to be notified of events
     *        generated by a cluster, you would set this parameter to cluster. If this value is not specified, events
     *        are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order
     *        to specify source IDs.</p>
     *        <p>
     *        Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     *        scheduled-action.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and scheduled-action.
     * </p>
     * 
     * @return The type of source that will be generating the events. For example, if you want to be notified of events
     *         generated by a cluster, you would set this parameter to cluster. If this value is not specified, events
     *         are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order
     *         to specify source IDs.</p>
     *         <p>
     *         Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     *         scheduled-action.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of source that will be generating the events. For example, if you want to be notified of events
     * generated by a cluster, you would set this parameter to cluster. If this value is not specified, events are
     * returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order to specify
     * source IDs.
     * </p>
     * <p>
     * Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and scheduled-action.
     * </p>
     * 
     * @param sourceType
     *        The type of source that will be generating the events. For example, if you want to be notified of events
     *        generated by a cluster, you would set this parameter to cluster. If this value is not specified, events
     *        are returned for all Amazon Redshift objects in your AWS account. You must specify a source type in order
     *        to specify source IDs.</p>
     *        <p>
     *        Valid values: cluster, cluster-parameter-group, cluster-security-group, cluster-snapshot, and
     *        scheduled-action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * 
     * @return A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *         same type as was specified in the source type parameter. The event subscription will return only events
     *         generated by the specified objects. If not specified, then events are returned for all objects within the
     *         source type specified.</p>
     *         <p>
     *         Example: my-cluster-1, my-cluster-2
     *         </p>
     *         <p>
     *         Example: my-snapshot-20131010
     */

    public java.util.List<String> getSourceIds() {
        if (sourceIds == null) {
            sourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourceIds;
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * 
     * @param sourceIds
     *        A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *        same type as was specified in the source type parameter. The event subscription will return only events
     *        generated by the specified objects. If not specified, then events are returned for all objects within the
     *        source type specified.</p>
     *        <p>
     *        Example: my-cluster-1, my-cluster-2
     *        </p>
     *        <p>
     *        Example: my-snapshot-20131010
     */

    public void setSourceIds(java.util.Collection<String> sourceIds) {
        if (sourceIds == null) {
            this.sourceIds = null;
            return;
        }

        this.sourceIds = new com.amazonaws.internal.SdkInternalList<String>(sourceIds);
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIds(java.util.Collection)} or {@link #withSourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sourceIds
     *        A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *        same type as was specified in the source type parameter. The event subscription will return only events
     *        generated by the specified objects. If not specified, then events are returned for all objects within the
     *        source type specified.</p>
     *        <p>
     *        Example: my-cluster-1, my-cluster-2
     *        </p>
     *        <p>
     *        Example: my-snapshot-20131010
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSourceIds(String... sourceIds) {
        if (this.sourceIds == null) {
            setSourceIds(new com.amazonaws.internal.SdkInternalList<String>(sourceIds.length));
        }
        for (String ele : sourceIds) {
            this.sourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the same type
     * as was specified in the source type parameter. The event subscription will return only events generated by the
     * specified objects. If not specified, then events are returned for all objects within the source type specified.
     * </p>
     * <p>
     * Example: my-cluster-1, my-cluster-2
     * </p>
     * <p>
     * Example: my-snapshot-20131010
     * </p>
     * 
     * @param sourceIds
     *        A list of one or more identifiers of Amazon Redshift source objects. All of the objects must be of the
     *        same type as was specified in the source type parameter. The event subscription will return only events
     *        generated by the specified objects. If not specified, then events are returned for all objects within the
     *        source type specified.</p>
     *        <p>
     *        Example: my-cluster-1, my-cluster-2
     *        </p>
     *        <p>
     *        Example: my-snapshot-20131010
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSourceIds(java.util.Collection<String> sourceIds) {
        setSourceIds(sourceIds);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * 
     * @return Specifies the Amazon Redshift event categories to be published by the event notification
     *         subscription.</p>
     *         <p>
     *         Values: configuration, management, monitoring, security
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * 
     * @param eventCategories
     *        Specifies the Amazon Redshift event categories to be published by the event notification subscription.</p>
     *        <p>
     *        Values: configuration, management, monitoring, security
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new com.amazonaws.internal.SdkInternalList<String>(eventCategories);
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        Specifies the Amazon Redshift event categories to be published by the event notification subscription.</p>
     *        <p>
     *        Values: configuration, management, monitoring, security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new com.amazonaws.internal.SdkInternalList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event categories to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: configuration, management, monitoring, security
     * </p>
     * 
     * @param eventCategories
     *        Specifies the Amazon Redshift event categories to be published by the event notification subscription.</p>
     *        <p>
     *        Values: configuration, management, monitoring, security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        Specifies the Amazon Redshift event severity to be published by the event notification subscription.</p>
     *        <p>
     *        Values: ERROR, INFO
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @return Specifies the Amazon Redshift event severity to be published by the event notification subscription.</p>
     *         <p>
     *         Values: ERROR, INFO
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * Specifies the Amazon Redshift event severity to be published by the event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        Specifies the Amazon Redshift event severity to be published by the event notification subscription.</p>
     *        <p>
     *        Values: ERROR, INFO
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     * enabled
     * </p>
     * 
     * @param enabled
     *        A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     *        enabled
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     * enabled
     * </p>
     * 
     * @return A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription
     *         is enabled
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     * enabled
     * </p>
     * 
     * @param enabled
     *        A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     *        enabled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyEventSubscriptionRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription is
     * enabled
     * </p>
     * 
     * @return A Boolean value indicating if the subscription is enabled. <code>true</code> indicates the subscription
     *         is enabled
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: ").append(getSubscriptionName()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceIds() != null)
            sb.append("SourceIds: ").append(getSourceIds()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEventSubscriptionRequest == false)
            return false;
        ModifyEventSubscriptionRequest other = (ModifyEventSubscriptionRequest) obj;
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceIds() == null ^ this.getSourceIds() == null)
            return false;
        if (other.getSourceIds() != null && other.getSourceIds().equals(this.getSourceIds()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceIds() == null) ? 0 : getSourceIds().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ModifyEventSubscriptionRequest clone() {
        return (ModifyEventSubscriptionRequest) super.clone();
    }

}
