/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apereo.cas.client.util;

import org.apereo.cas.client.validation.Assertion;

/**
 * Static holder that places Assertion in a ThreadLocal.
 *
 * @author Scott Battaglia
 * @since 3.0
 */
public class AssertionHolder {

    /**
     * ThreadLocal to hold the Assertion for Threads to access.
     */
    private static final ThreadLocal<Assertion> threadLocal = new ThreadLocal<Assertion>();

    /**
     * Retrieve the assertion from the ThreadLocal.
     *
     * @return the Asssertion associated with this thread.
     */
    public static Assertion getAssertion() {
        return threadLocal.get();
    }

    /**
     * Add the Assertion to the ThreadLocal.
     *
     * @param assertion the assertion to add.
     */
    public static void setAssertion(final Assertion assertion) {
        threadLocal.set(assertion);
    }

    /**
     * Clear the ThreadLocal.
     */
    public static void clear() {
        threadLocal.set(null);
    }
}
