/*
 *    Copyright 2009-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.record_type;

import java.util.Objects;

public final class Property {
  private final int id;
  private final String value;
  private final String URL;

  Property(int id, String value, String URL) {
    this.id = id;
    this.value = value;
    this.URL = URL;
  }

  public int id() {
    return id;
  }

  public String value() {
    return value;
  }

  public String URL() {
    return URL;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    Property that = (Property) obj;
    return this.id == that.id &&
      Objects.equals(this.value, that.value) &&
      Objects.equals(this.URL, that.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, URL);
  }

  @Override
  public String toString() {
    return "Property[" +
      "id=" + id + ", " +
      "value=" + value + ", " +
      "URL=" + URL + ']';
  }


}
