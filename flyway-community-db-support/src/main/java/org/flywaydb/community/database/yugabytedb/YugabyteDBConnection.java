/*
 * Copyright (C) Red Gate Software Ltd 2010-2023
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.community.database.yugabytedb;

import org.flywaydb.core.internal.database.base.Schema;
import org.flywaydb.core.internal.database.postgresql.PostgreSQLConnection;

public class YugabyteDBConnection extends PostgreSQLConnection {

    YugabyteDBConnection(YugabyteDBDatabase database, java.sql.Connection connection) {
        super(database, connection);
    }

    @Override
    public Schema getSchema(String name) {
        return new YugabyteDBSchema(jdbcTemplate, (YugabyteDBDatabase) database, name);
    }
}