/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.spring.data.documentdb.core.query;

import org.junit.Test;

import java.util.LinkedHashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class CriteriaUnitTest {

    @Test
    public void testSimpleCriteria() {
        final LinkedHashMap<String, Object> value = new LinkedHashMap<String, Object>();
        value.put("name", "test");
        final Criteria c = new Criteria("name", value);

        assertThat(c.getKey()).isEqualTo("name");
        assertThat(c.getCriteriaObject()).isEqualTo("test");
    }
}
