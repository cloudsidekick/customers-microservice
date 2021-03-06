/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
package example.customers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Oliver Gierke
 */
/* simulating a change to add middle initial */

/* favorite store feature here */
/* store favorite store name with id */
/* another typo fix */
/* another typo fix */
/* big time change */
/* big time change */
/* simulate a fix for customer lookup error */
/* another fix */
/* love fixes */
/* comments as code change */
/* comments as code change */
/* simulate a change */
/* simulate a change */
/* fixing dups */
/* a change */
/* a change */



@Entity
@Data
public class Customer {

	@Id @GeneratedValue Long id;
	String firstname, lastname;
	Address address;
}
