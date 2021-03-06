/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.geronimo.microprofile.openapi.impl.model;

import java.util.Map;
import java.util.Objects;

import javax.enterprise.inject.Vetoed;
import javax.json.bind.annotation.JsonbTransient;

import org.eclipse.microprofile.openapi.models.Extensible;
import org.eclipse.microprofile.openapi.models.ExternalDocumentation;

@Vetoed
public class ExternalDocumentationImpl implements ExternalDocumentation {

    private Extensible _extensible = new ExtensibleImpl();

    private String _description;

    private String _url;

    @Override
    @JsonbTransient
    public Map<String, Object> getExtensions() {
        return _extensible.getExtensions();
    }

    @Override
    public void setExtensions(final Map<String, Object> extensions) {
        _extensible.setExtensions(extensions);
    }

    @Override
    public ExternalDocumentation addExtension(final String name, final Object value) {
        _extensible.addExtension(name, value);
        return this;
    }

    @Override
    public void removeExtension(final String name) {
        _extensible.removeExtension(name);
    }

    @Override
    public String getDescription() {
        return _description;
    }

    @Override
    public void setDescription(final String _description) {
        this._description = _description;
    }

    @Override
    public ExternalDocumentation description(final String _description) {
        setDescription(_description);
        return this;
    }

    @Override
    public String getUrl() {
        return _url;
    }

    @Override
    public void setUrl(final String _url) {
        this._url = _url;
    }

    @Override
    public ExternalDocumentation url(final String _url) {
        setUrl(_url);
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final ExternalDocumentationImpl that = ExternalDocumentationImpl.class.cast(o);
        return Objects.equals(_extensible, that._extensible) && Objects.equals(_description,
                that._description) && Objects.equals(_url, that._url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_extensible, _description, _url);
    }
}
