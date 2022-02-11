package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class InsertionSortImplementationTest extends AnyFlatSpec {

  val sort = new InsertionSortImplementation

  "Condition" should "give sorted list when an non empty unsorted list is passed" in {
    assert(List(1, 3, 4, 6, 9) == sort.insertionSort(List(9, 4, 1, 3, 6)))
  }
  "Condition" should "give sorted list when an non empty unsorted list is passed with some common integers" in {
    assert(List(1, 1, 4, 4, 6, 9) == sort.insertionSort(List(9, 4, 1, 4, 6, 1)))
  }
  "Condition" should "throw an exception when an empty list is passed" in {
    val error = "List is Empty"
    val thrown = intercept[EmptyListException] {
      sort.insertionSort(List())
    }
    assert(thrown.getMessage == error)
  }
}