/*
* Copyright (C) 2005 - 2014 Jaspersoft Corporation. All rights  reserved.
* http://www.jaspersoft.com.
*
* Unless you have purchased  a commercial license agreement from Jaspersoft,
* the following license terms  apply:
*
* This program is free software: you can redistribute it and/or  modify
* it under the terms of the GNU Affero General Public License  as
* published by the Free Software Foundation, either version 3 of  the
* License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Affero  General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public  License
* along with this program.&nbsp; If not, see <http://www.gnu.org/licenses/>.
*/
package com.jaspersoft.tamanoir.connection.storage;

import com.jaspersoft.tamanoir.connection.DataSet;
import com.jaspersoft.tamanoir.dto.QueryConnectionDescriptor;

import java.util.UUID;

/**
 * <p></p>
 *
 * @author Yaroslav.Kovalchyk
 */
public class ConnectionContainer {
    private UUID uuid;
    private QueryConnectionDescriptor connectionDescriptor;
    private volatile DataSet<?,?> dataSet;

    public UUID getUuid() {
        return uuid;
    }

    public ConnectionContainer setUuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public QueryConnectionDescriptor getConnectionDescriptor() {
        return connectionDescriptor;
    }

    public ConnectionContainer setConnectionDescriptor(QueryConnectionDescriptor connectionDescriptor) {
        this.connectionDescriptor = connectionDescriptor;
        return this;
    }

    public <T extends DataSet> T getDataSet() {
        return (T) dataSet;
    }

    public ConnectionContainer setDataSet(DataSet<?, ?> dataSet) {
        this.dataSet = dataSet;
        return this;
    }
}
