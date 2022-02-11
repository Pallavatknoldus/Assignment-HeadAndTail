package com.knoldus

class EmptyListException extends NullPointerException("List is Empty")

class InsertionSortImplementation {

  def insertionSort(list: List[Int]): List[Int] = {
    list match {
      case List() => throw new EmptyListException
      case _ => innerInsertionSort(list)
    }
  }

  private def innerInsertionSort(list: List[Int]): List[Int] =
    list match {
      case List() => Nil
      case _ => insert(list.head, innerInsertionSort(list.tail))
    }

  private def insert(head: Int, listTail: List[Int]): List[Int] =
    if (listTail.isEmpty || head <= listTail.head) head :: listTail
    else listTail.head :: insert(head, listTail.tail)
}