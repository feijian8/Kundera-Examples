/*
 * Copyright 2011 Impetus Infotech.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.impetus.kundera.examples.twitter.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.impetus.kundera.examples.twitter.utils.ExampleUtils;

/**
 * Entity class for user's External link details
 * 
 * @author amresh.singh
 */

@Entity
@Table(name = "externalLinks", schema = "KunderaExamples")
public class ExternalLink
{

    @Id
    private String extLinkId;

    @Column(name = "link_type")
    private String linkType;

    @Column(name = "link_address")
    private String linkAddress;

    public ExternalLink()
    {

    }

    public ExternalLink(String type, String address)
    {
        this.extLinkId = ExampleUtils.getUniqueId();
        this.linkType = type;
        this.linkAddress = address;
    }

    /**
     * @return the extLinkId
     */
    public String getExtLinkId()
    {
        return extLinkId;
    }

    /**
     * @param extLinkId
     *            the extLinkId to set
     */
    public void setExtLinkId(String extLinkId)
    {
        this.extLinkId = extLinkId;
    }

    /**
     * @return the linkType
     */
    public String getLinkType()
    {
        return linkType;
    }

    /**
     * @param linkType
     *            the linkType to set
     */
    public void setLinkType(String linkType)
    {
        this.linkType = linkType;
    }

    /**
     * @return the linkAddress
     */
    public String getLinkAddress()
    {
        return linkAddress;
    }

    /**
     * @param linkAddress
     *            the linkAddress to set
     */
    public void setLinkAddress(String linkAddress)
    {
        this.linkAddress = linkAddress;
    }
}
