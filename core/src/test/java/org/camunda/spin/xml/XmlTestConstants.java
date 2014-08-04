/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.camunda.spin.xml;

import org.camunda.spin.impl.util.IoUtil;

import java.io.InputStream;

/**
 * @author Daniel Meyer
 *
 */
public class XmlTestConstants {

  public static final String EXAMPLE_NAMESPACE = "http://camunda.org/example";

  public static final String EXAMPLE_XML_FILE_NAME = "org/camunda/spin/xml/example.xml";

  public static final String EXAMPLE_XML = IoUtil.readFileAsString(EXAMPLE_XML_FILE_NAME);

  public static final String EXAMPLE_INVALID_XML = "<invalid";

  public static final String EXAMPLE_EMPTY_STRING = "";

  public static final String NON_EXISTING = "nonExisting";

  public static InputStream exampleXmlFileAsStream() {
    return IoUtil.getFileAsStream(EXAMPLE_XML_FILE_NAME);
  }

}
