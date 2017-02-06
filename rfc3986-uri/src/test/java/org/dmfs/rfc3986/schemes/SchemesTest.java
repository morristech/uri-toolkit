/*
 * Copyright 2017 dmfs GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dmfs.rfc3986.schemes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * @author marten
 */
public class SchemesTest
{
    @Test
    public void testSchemes()
    {
        assertEquals("ftp", Schemes.FTP.toString());
        assertEquals("http", Schemes.HTTP.toString());
        assertEquals("https", Schemes.HTTPS.toString());
        assertEquals("mailto", Schemes.MAILTO.toString());
    }
}