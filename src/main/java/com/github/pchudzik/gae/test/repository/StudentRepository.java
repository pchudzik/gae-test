package com.github.pchudzik.gae.test.repository;

import com.github.pchudzik.gae.test.domain.Student;
import com.google.appengine.api.datastore.Key;

/**
* User: pawel
* Date: 20.07.13
* Time: 13:17
*/
public interface StudentRepository extends CustomRepository<Student, Key> {
}
