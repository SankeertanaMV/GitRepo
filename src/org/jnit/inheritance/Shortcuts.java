package org.jnit.inheritance;

public class Shortcuts {
	// default parent for all the classes is object class
	//A class cannot have more than one parent
	//this keyword is used to call one constructor from another constructor within the same class
	//child class will not have visibility of the parent class private variables
    //From child class constructor we can call parent class constructor
    //A child can have access to its parent stuff but a parent cannot have access to its child's stuff
    // ctl+ space - auto complete function
	// Constructor call must be the first statement in a constructor
	//Constructor has to be private
	//when u create a child class object, your parent class constructors will be called automatically by JVM--> Constructor chaining
	//Overriding comes under run-time polymorphism
	//Overriding is a concept where you override the behavior of the parent class in a child class
	//void methods cannot be put inside system.out.println method
	// MethodHiding-overriding static methods-the process of having the same static method between your parent 
	  //...class and child class is called method hiding-parentclass.method name
	// private methods cannot be overridden
	// access modifiers
	// public - classes,variables,methods,constructors
	// private- variables,methods,constructors
	// The below two modifiers defines ur package level access
	// protected-variables,methods,constructors-within the same package plus child class in a different package
	// default-classes,variables,methods,constructors-only within the same package
	//upcasting-casting a sub class object to a super class reference
	//Downcasting- casting a super class ref to a sub class object
	// u can cast a child to a parent but u cannot cast a parent to a child. Type casting must be done to do so.
    // Abstract class VS Concrete class
	  // 1.Abstract class cannot be instantiated, we cannot create a object
	  // 2. Abstract classes have abstract methods
	  // 3. an abstract method is a  method which doesn't have any body
	  // 4. we create an abstract class so that the child class extending the abstract class has to provide implementation
   // whenever we have an abstract method in the parent class, we need to have its implementation(body) in the child classes
   // Interface: Brings unrelated classes together
	// very similar to abstract class which cannot be instantiated
	// If u want to provide some functionality to only few child classes not all,then u can use interface
   // Difference between interface and an abstract class
	// 1.An interface and abstract class both cannot be instantiated
	// 2.An interface can only have final and static varibles also it can only have abstract classes
	// 3.A class can extend only one class whereas a class can implement more than one interface
	//An interface can have abstract methods and variables
	// variables should only be static or final
	//cannot have instace methods or regular variables
	// check what type of object we are receiving using the keyword instance of
	//getChars(srcbegin,srcend,dest array,destarray src begin)
	//r.split("some delimeter on which the string is going to split")
	//r.startswith and r.endswith are boolean functions
	// There are 3 kinds of division in memory locations called permgen,stack,heap
	//when u declare String s3 = "hello"; it directly stores in to permgen where string literals are stored permenantly
	//when u declare String s4 = "hello"; both s3 and s4 will be pointing to same memory location(string literal)
	//when u declare String s5 = new String("hello"); it is going to be stored in heap memory
	//and when u declare String s6 = new String("hello"); a new object is created which points towards a different memory
	    //location in the heap memory
	// == checks if u have two different references say s3 and s4 pointing to the same object
	   // == is reference equality operator(for objects) ; true if pointing to same object and vice-versa
	// .equals compares the contents of the objects and returns true if both are same else it returns false
	//compareTo() compares two strings lexically and returns a value which if negative says that the word comes first
	   //or if it returns a positive it says that the word comes latter.if 0,both words matches
	//regionMatches() compares whether a region of both the strings matches, provided the starting index and ending 
	    //index of the region to be compared 
	//StringTokenizer() is similar to split() but the only difference is split() returns the values in the form of
	   //an array while StringTokenizer() returns the values in the form of tokens divided by custom provided delimeters
	// Enum is group of related predefined set of constants
	// strings in java are immutable means once created cannot be modified
	//immutable means --> helloworld is created with hello being garbaged
	//mutable means --> helloworld is created with world being appended to hello
	// StringBuffer or StringBuilder is used to achieve mutable nature
	// u cannot use StringBuilder in Multithreaded environments as it is not thread safe
	//threadsafe:two peaople(objects) trying to access same information at the same time
	//Regex or regularexpression is used to check whether there is something in the desired pattern/format
	//for advanced regular rexpressions we can use pattern matcher class in java
	//pattern is what are u looking for
	//matcher finds and replace replaces the characters
	//Types of references to an object are
	 // 1.Strong 2.Weak 3.Soft 4.Phantom // will define when the object should be garbage collected
	//collection of objects also called datastructures 
	//in array datastructures u should always state the size whereas in collections u need not define the size priorly
	//Collections is Interface and its hierarchy is
	  //Lists-1 Arraylist 2- LinkedLst 2-VectorList // All the three are classes
	  //Sets
	  //Queue
	//<> contents inside this are called generics in java,they add compile time safety to ur class
			//we can only add strings to our colors list
			//arraylist is built on top of an array
			//index starts at 0,u can start accesing ur elements using index,we can replace an element using index
			//its an ordered and index based collection
			//list datastructures allow duplicates
			// ur index in textbook resembles the collections in arraylist
			//reindexing happens on removals and additions
			//it starts with size 10 and when it crosses 10 it grows 0.5 times of its current size(15)
	//Difference between datastructure arraylist and linkedlist
	//1.Arraylist is an array based collection
	//2.Linkedlist is a node based collection
	//In Linkedlist additions and removals are very faster compared to arraylist
	//In Arraylist accesing by index is faster compared to linkedlist
	//In LL's index retreivals are linear
	//Singley linkedlist,doubly linkedlist,circularly linkedlist
	// array list and vector list are very similar as vector list is also array based index.
	//only 2 differences b/w array and vector are
	//1. vector is thread safe datastructure
	//2. vectors initial size is also 10. but it grows by 10 everytime
	//In collections,we cannot insert primitive values directly into datastructures so, we have to use 
	  //corresponding wrapper classes
	  //int-Integer
	  //long-Long
	  //char-Character
	  //boolean-Boolean

	//Autoboxing and Unboxing//Assigning wrapper class to a primitive class
	//Autoboxing-u directly assign ur primitive value to the wrapper class
	//Difference b/w List DS and Set DS
	//List is an ordered collection so it maintains ordered insertions it allows duplicates
	//Set on the other hand doesn't allow duplicates
	//Set doesn't maintain an insertion order
	//not an index based collection
	//Difference b/w HashSet and LinkedHashSet
	//UnderneathLinkedHashSet,Linkedlists are performed
	//LinkedHashset is an ordred collection,it maintains insertion order
	//TreeSet
	//Parent interface of a Tree set is a Sorted set=to have ur set sorted use TreeSet
	//Treeset is sorted set and it prevents dupes
	//Treeset relies on CompareTo() to compare ur TreeSet  variables,whereas HashSet and LinkedHashSet both depend on equalsto()
	
	//Fail safe(listiterator/works on copy of list) Vs Fail fast(all othe iterators/works on original list)iterator
	//add -for-each-CME,iterator = CME,list-iterator-add=no issues
	//remove -for-each=re-indexing, iterator = preferred(no re-indexing during iteration)
	//update -for-each - no issues,iterator = no issues,we can update
	//read - for-each,iterator = no issues, we can read
	
	//Hash Collision is a scenario where two objects has the same hash code
	//So all the objects with same hashcode are stored in the same location as a Linkedlist
	
	//Serialization-is a process where we convert our objects to a storage(using write object)(bits and bytes)and store them into(file,database) which makes it possible to 
	   //retrieve the objects in another jvm(computer)(deserialization)(using readobject keyword instead of new keyword)
	   //keyword transient indicates to JVM that property should not be serialized
	//Difference b/w Statement and Prepared Statement also called Pre-Compiled Statements which redempts the process of Compiling again and again//also allows parameterized sql
	  //Statements-All the three steps are executed i.e.,compilation,execution,result 
//DriverManager Vs DataSource
	//DataSource provides an excellent feature called connection pooling-performance benefits
	//Transaction Management-ACID properties
//XML-Platform Independent language u can create ur own file.(XML Document)
	//Any format of data can be represented by XML
	//Data flow is possible b/t two apllications using an XML file
	//Database is preferred to XML because data management is possible in DB 
	//XML file can also be stored in to DB using Blob and Glog
	//CSS can be applied to XML documents
	//XML contains(declaration,elements,attributes,spcl intructions to xml parser,comments,cdata,entities)
	//Xpath is very similar to SQL in database
	//using Xpath u can perform a query on ur XML document
	//JAXP-Java API for XML Building(to parse ur XML file)
	//SAX-Simple API for XML 
	//DOM-Document Object Model
//Tree Based Processor-DOM
	//Difference b/w SAX processor and DOM processor is DOM is a tree-based parser(read/write parser)/u can perform any operations using DOM parser//loads whole XML document into the memory
//Streaming Processor-SAX
	//SAX parser is a streaming based parser,it doesn;t load whole XML document into ur memory,it will go element by element/Is a read-onloy parser u cannot write using SAX parser
//Binding Processor-JAXB
	//JAXB-Java API for XML Binding-Binding Processor
	//JAXB-To bind java classes to XML documents
	//i.e., for every customer.xml there exists a corresponding customer.java class
	//We basically map our XML document with the java class using JAXB
//XOM,DOM4XSTREAM-other xml parsing technologies available 
//3layers of project-UI,java,Data	
	//JDBC-DriverManager
	//Datasource- StandAlone
	           //-Server Connected-We create datasource inside the server-Server provides a service called connection pooling
	           //ApplicationServers-JBoss,WebSphere,WebLogic
// 2 types of Servers
	//1.WebServer-TomCat,Apache,WebServers
	//2.ApplicationServer-JBoss,Weblogic,Websphere,Glassfish
	//Commonly used,opensource are Tomcat and Jboss  
	
//First topic in Java EE is Servlets
	//Request-Response model: where url is sent from brwser and a resopnse is recieved
	//2 types of response
	//1.Static:Gmail.com:Doesnot vary from person to person
	//2.Dynamic:After logging in the content is different from person to person
	//Components involved: Browser,Server
	//Browser sends a http request to server(url helps in matching to a server)
	//Servers:Web servers:static content:ex; Apache
		//Application servers:Dynamic content:Jboss,Webshere,Tomcat etc
	//So basically Apache is an HTTP Server, serving HTTP. Tomcat is a Servlet and JSP Server serving Java technologies.
	//Server should know hoow to handle it so we have a Java EE web application contains servlets gets the request, query the databse,get the result and send the response back to the server which sends to a client
	//Http Request contains
	  //1.Method/Action to be performed/Type : get or post
	  //2.URL:Requested Resource
	  //3.Form parameters
	//Http Response contains
	  //1.Status code(404-error,200-succesfull)
	  //2.Content-type(text,picture,pdf)
	  //3.Content
//Methods:
	//GET/HEAD: safe actions
	//POST/PUT/DELETE: unsafe actions
//The OPTIONS method represents a request for information about the communication options available on the request/response chain identified by the Request-URI
//The GET method means retrieve whatever information (in the form of an entity) is identified by the Request-URI
//The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response
//The POST method is used to request that the origin server accept the entity enclosed in the request as a new subordinate of the resource identified by the Request-URI in the Request-Line. 	
//The PUT method requests that the enclosed entity be stored under the supplied Request-URI. If the Request-URI refers to an already existing resource,
//The DELETE method requests that the origin server delete the resource identified by the Request-URI. 
//The TRACE method is used to invoke a remote, application-layer loop- back of the request message
//This specification reserves the method name CONNECT for use with a proxy that can dynamically switch to being a tunnel (e.g. SSL tunneling [44]).

//Web-container(Servlet-container) is in server where Servlets reside.	
	//container will provide all the services required for ur components(eg; multithreading,life cycle of servlet,request and response(communication),security
	
//Web.xml is also called Deployment Descriptor	
	
}


 