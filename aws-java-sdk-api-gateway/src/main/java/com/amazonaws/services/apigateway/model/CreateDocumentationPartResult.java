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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A documentation part for a targeted API entity.
 * </p>
 * <div class="remarks">
 * <p>
 * A documentation part consists of a content map (<code>properties</code>) and a target (<code>location</code>). The
 * target specifies an API entity to which the documentation content applies. The supported API entity types are
 * <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>,
 * <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>,
 * <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Valid <code>location</code>
 * fields depend on the API entity type. All valid fields are not required.
 * </p>
 * <p>
 * The content map is a JSON string of API-specific key-value pairs. Although an API can use any shape for the content
 * map, only the OpenAPI-compliant documentation fields will be injected into the associated API entity definition in
 * the exported OpenAPI definition file.
 * </p>
 * </div> <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html">Documenting an
 * API</a>, <a>DocumentationParts</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDocumentationPartResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code> is
     * created.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The location of the API entity to which the documentation applies. Valid fields depend on the targeted API entity
     * type. All the valid location fields are not required. If not explicitly specified, a valid location field is
     * treated as a wildcard and associated documentation content may be inherited by matching entities, unless
     * overridden.
     * </p>
     */
    private DocumentationPartLocation location;
    /**
     * <p>
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a
     * JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     * documentation-related fields from the <literal>properties</literal> map are exported and, hence, published as
     * part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of
     * <code>x-amazon-apigateway-documentation</code>.
     * </p>
     */
    private String properties;

    /**
     * <p>
     * The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code> is
     * created.
     * </p>
     * 
     * @param id
     *        The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code>
     *        is created.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code> is
     * created.
     * </p>
     * 
     * @return The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code>
     *         is created.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code> is
     * created.
     * </p>
     * 
     * @param id
     *        The <a>DocumentationPart</a> identifier, generated by API Gateway when the <code>DocumentationPart</code>
     *        is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationPartResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The location of the API entity to which the documentation applies. Valid fields depend on the targeted API entity
     * type. All the valid location fields are not required. If not explicitly specified, a valid location field is
     * treated as a wildcard and associated documentation content may be inherited by matching entities, unless
     * overridden.
     * </p>
     * 
     * @param location
     *        The location of the API entity to which the documentation applies. Valid fields depend on the targeted API
     *        entity type. All the valid location fields are not required. If not explicitly specified, a valid location
     *        field is treated as a wildcard and associated documentation content may be inherited by matching entities,
     *        unless overridden.
     */

    public void setLocation(DocumentationPartLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the API entity to which the documentation applies. Valid fields depend on the targeted API entity
     * type. All the valid location fields are not required. If not explicitly specified, a valid location field is
     * treated as a wildcard and associated documentation content may be inherited by matching entities, unless
     * overridden.
     * </p>
     * 
     * @return The location of the API entity to which the documentation applies. Valid fields depend on the targeted
     *         API entity type. All the valid location fields are not required. If not explicitly specified, a valid
     *         location field is treated as a wildcard and associated documentation content may be inherited by matching
     *         entities, unless overridden.
     */

    public DocumentationPartLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location of the API entity to which the documentation applies. Valid fields depend on the targeted API entity
     * type. All the valid location fields are not required. If not explicitly specified, a valid location field is
     * treated as a wildcard and associated documentation content may be inherited by matching entities, unless
     * overridden.
     * </p>
     * 
     * @param location
     *        The location of the API entity to which the documentation applies. Valid fields depend on the targeted API
     *        entity type. All the valid location fields are not required. If not explicitly specified, a valid location
     *        field is treated as a wildcard and associated documentation content may be inherited by matching entities,
     *        unless overridden.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationPartResult withLocation(DocumentationPartLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a
     * JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     * documentation-related fields from the <literal>properties</literal> map are exported and, hence, published as
     * part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of
     * <code>x-amazon-apigateway-documentation</code>.
     * </p>
     * 
     * @param properties
     *        A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded
     *        as a JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     *        documentation-related fields from the <literal>properties</literal> map are exported and, hence, published
     *        as part of the API entity definitions, while the original documentation parts are exported in a OpenAPI
     *        extension of <code>x-amazon-apigateway-documentation</code>.
     */

    public void setProperties(String properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a
     * JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     * documentation-related fields from the <literal>properties</literal> map are exported and, hence, published as
     * part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of
     * <code>x-amazon-apigateway-documentation</code>.
     * </p>
     * 
     * @return A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded
     *         as a JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     *         documentation-related fields from the <literal>properties</literal> map are exported and, hence,
     *         published as part of the API entity definitions, while the original documentation parts are exported in a
     *         OpenAPI extension of <code>x-amazon-apigateway-documentation</code>.
     */

    public String getProperties() {
        return this.properties;
    }

    /**
     * <p>
     * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a
     * JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     * documentation-related fields from the <literal>properties</literal> map are exported and, hence, published as
     * part of the API entity definitions, while the original documentation parts are exported in a OpenAPI extension of
     * <code>x-amazon-apigateway-documentation</code>.
     * </p>
     * 
     * @param properties
     *        A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded
     *        as a JSON string, e.g., <code>"{ \"description\": \"The API does ...\" }"</code>. Only OpenAPI-compliant
     *        documentation-related fields from the <literal>properties</literal> map are exported and, hence, published
     *        as part of the API entity definitions, while the original documentation parts are exported in a OpenAPI
     *        extension of <code>x-amazon-apigateway-documentation</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDocumentationPartResult withProperties(String properties) {
        setProperties(properties);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDocumentationPartResult == false)
            return false;
        CreateDocumentationPartResult other = (CreateDocumentationPartResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public CreateDocumentationPartResult clone() {
        try {
            return (CreateDocumentationPartResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
