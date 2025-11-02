@Test
void testHelloNull() {
    Greeting greeting = new Greeting();
    String result = greeting.sayHello(null);
    assertEquals("Hello, Friend", result);
}
