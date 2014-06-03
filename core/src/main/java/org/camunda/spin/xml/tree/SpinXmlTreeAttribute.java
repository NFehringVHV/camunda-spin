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
package org.camunda.spin.xml.tree;

import java.io.OutputStream;
import java.io.Writer;

/**
 * An attribute in a tree-oriented XML data format.
 *
 * @author Sebastian  Menski
 * @author Daniel Meyer
 *
 */
public abstract class SpinXmlTreeAttribute extends SpinXmlTreeNode<SpinXmlTreeAttribute> {

  /**
   * Returns the value of the attribute as {@link String}.
   *
   * @return the string value of the attribute
   */
  public abstract String value();

  /**
   * Sets the value of the attribute.
   *
   * @param value the value to set
   * @return the wrapped xml dom attribute
   * @throws SpinXmlTreeNodeException if the value is null
   */
  public abstract SpinXmlTreeAttribute value(String value);

  /**
   * Removes the attribute.
   *
   * @return the wrapped owner {@link SpinXmlTreeElement tree element}
   */
  public abstract SpinXmlTreeElement remove();

  /**
   * Returns the wrapped XML attribute value as string representation.
   *
   * @return the string representation
   */
  public abstract String toString();

  /**
   * Returns the wrapped XML attribute value as output stream.
   *
   * @return the output stream
   */
  public abstract OutputStream toStream();

  /**
   * Writes the wrapped XML attribute value to a existing stream.
   *
   * @param outputStream the stream to write to
   * @return the stream after the object was written
   */
  public abstract <S extends OutputStream> S writeToStream(S outputStream);

  /**
   * Writes the wrapped XML attribute value to a existing writer.
   *
   * @param writer the writer to write to
   * @return the Writer after the object was written
   */
  public abstract <W extends Writer> W writeToWriter(W writer);

}
