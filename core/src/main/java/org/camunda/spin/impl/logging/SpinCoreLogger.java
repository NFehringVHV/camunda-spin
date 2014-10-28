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
package org.camunda.spin.impl.logging;

import org.camunda.spin.SpinFileNotFoundException;
import org.camunda.spin.SpinRuntimeException;
import org.camunda.spin.SpinScriptException;
import org.camunda.spin.spi.SpinDataFormatException;
import org.camunda.spin.xml.SpinXmlElement;
import org.camunda.spin.xml.SpinXmlElementException;

import java.io.IOException;


/**
 * The Logger for the core api.
 *
 * @author Daniel Meyer
 * @author Sebastian Menski
 *
 */
public class SpinCoreLogger extends SpinLogger {

  public IllegalArgumentException unsupportedInputParameter(Class<?> parameterClass) {
    return new IllegalArgumentException(exceptionMessage("001", "Unsupported input of type '{}'", parameterClass.getName()));
  }

  public SpinFileNotFoundException fileNotFoundException(String filename, Throwable cause) {
    return new SpinFileNotFoundException(exceptionMessage("002", "Unable to find file with path '{}'", filename), cause);
  }

  public SpinFileNotFoundException fileNotFoundException(String filename) {
    return fileNotFoundException(filename, null);
  }

  public SpinRuntimeException unableToReadInputStream(Exception e) {
    return new SpinRuntimeException(exceptionMessage("003", "Unable to read input stream"), e);
  }

  public SpinDataFormatException unrecognizableDataFormatException() {
    return new SpinDataFormatException(exceptionMessage("004", "No matching data format detected"));
  }

  public SpinXmlElementException elementIsNotChildOfThisElement(SpinXmlElement existingChildElement, SpinXmlElement parentDomElement) {
    return new SpinXmlElementException(exceptionMessage("005", "The element with namespace '{}' and name '{}' " +
        "is not a child element of the element with namespace '{}' and name '{}'",
      existingChildElement.namespace(), existingChildElement.name(),
      parentDomElement.namespace(), parentDomElement.name()
    ));
  }

  public SpinScriptException noScriptEnvFoundForLanguage(String scriptLanguage, String path) {
    return new SpinScriptException(exceptionMessage("006", "No script script env found for script language '{}' at path '{}'", scriptLanguage, path));
  }

  public IOException unableToRewindInputStream() {
    return new IOException(exceptionMessage("007", "Unable to rewind input stream: rewind buffering limit exceeded"));
  }

  public SpinDataFormatException multipleProvidersForDataformat(String dataFormatName) {
    return new SpinDataFormatException(exceptionMessage("008", "Multiple providers found for dataformat '{}'", dataFormatName));
  }
}