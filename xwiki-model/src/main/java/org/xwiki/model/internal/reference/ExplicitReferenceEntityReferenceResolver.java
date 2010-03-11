/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.model.internal.reference;

import org.xwiki.component.annotation.Component;
import org.xwiki.model.EntityType;
import org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver;
import org.xwiki.model.reference.EntityReference;

/**
 * Resolver that resolves a Reference passed as a String into an absolute reference. For missing reference parts, the
 * resolver takes default values from a parameter which must be of type {@link EntityReference}.
 *
 * @version $Id: ExplicitStringEntityReferenceResolver.java 27580 2010-03-11 14:32:23Z vmassol $
 * @since 2.23
 */
@Component("explicit/reference")
public class ExplicitReferenceEntityReferenceResolver extends AbstractReferenceEntityReferenceResolver
{
    /**
     * {@inheritDoc}
     *
     * Expects an EntityReference parameter from which to extract the default values.
     *
     * @see AbstractStringEntityReferenceResolver#getDefaultValue
     */
    @Override
    protected String getDefaultValue(EntityType type, Object... parameters)
    {
        throw new IllegalArgumentException("The resolver parameter doesn't contain an Entity Reference of type ["
            + type + "]");
    }
}
