def question1(): Unit = {
	println("Product names in inventory1:");
	println(getAllProductNames(inventory1));
	println("Product names in inventory2:");
	println(getAllProductNames(inventory2));
	println("\nTotal value of inventory1: " + totalValueOfInventory(inventory1));
	println("Total value of inventory2: " + totalValueOfInventory(inventory2));
	println("\nIs inventory1 empty? " + isEmpty(inventory1));
	println("Is inventory2 empty? " + isEmpty(inventory2));
	println("\nMerged inventory:");
	println(mergeInventories(inventory1, inventory2));
	println("\nFinding product with ID 101 in inventory1:");
	findProduct(101, inventory1);
	println("Finding product with ID 105 in inventory1:");
	findProduct(105, inventory1);
}

case class Product(name: String, price: Double, quantity: Int);

val inventory1: Map[Int, Product] = Map(
	101 -> Product("apple", 2.0, 10),
	102 -> Product("banana", 0.5, 20),
	103 -> Product("cherry", 0.1, 30)
);

val inventory2: Map[Int, Product] = Map(
	104 -> Product("grape", 2.0, 40),
	101 -> Product("apple", 1.5, 50),
	102 -> Product("banana", 1.1, 60)
);

def getAllProductNames(inventory: Map[Int, Product]): List[String] = {
	inventory.values.map(product => product.name).toList
}

def totalValueOfInventory(inventory: Map[Int, Product]): Double = {
	inventory.values.map(product => product.price * product.quantity).sum
}

def isEmpty(inventory: Map[Int, Product]): Boolean = {
	inventory.values.map(product => product.quantity).sum == 0
}

def mergeInventories(
			inventory1: Map[Int, Product], 
			inventory2: Map[Int, Product]): Map[Int, Product] = {
			
	var mergedInventory = inventory1;

	inventory2.foreach((id, product) => {
		if (mergedInventory.contains(id)) then {
			val name = mergedInventory(id).name;
			val price = Math.max(mergedInventory(id).price, product.price);
			val quantity = mergedInventory(id).quantity + product.quantity;
			mergedInventory = mergedInventory.updated(id, Product(name, price, quantity));
		} else {
			mergedInventory = mergedInventory.updated(id, product);
		}
	});

	mergedInventory;
}

def findProduct(id: Int, inventory: Map[Int, Product]): Unit = {
	if (inventory.keySet.contains(id)) then {
		val product = inventory(id);
		println("ID " + id + " found:");
		println("\tName: " + product.name);
		println("\tPrice: " + product.price);
		println("\tQuantity: " + product.quantity);
	} else {
		println("ID " + id + " not found.")
	}
}