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

public final class Item {
  private final Integer id;
  private final Property property;

  Item(Integer id, Property property) {
    this.id = id;
    this.property = property;
  }

  public Integer id() {
    return id;
  }

  public Property property() {
    return property;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    Item that = (Item) obj;
    return Objects.equals(this.id, that.id) &&
      Objects.equals(this.property, that.property);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, property);
  }

  @Override
  public String toString() {
    return "Item[" +
      "id=" + id + ", " +
      "property=" + property + ']';
  }

}
