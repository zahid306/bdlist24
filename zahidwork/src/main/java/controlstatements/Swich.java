package controlstatements;

public class Swich {

	public static void main(String[] args) {

		switch ("Edge") {
		
		case "Chrome":
			System.out.println("Me zahid...");
			System.out.println("Me zahid...");
			System.out.println("Me zahid...");
			break;

		case "FireFOx":
			System.out.println("Me Zaid...");
			System.out.println("Me Zaid...");
			System.out.println("Me Zaid...");
			break;

		case "IE":
			System.out.println("Me Ali...");
			System.out.println("Me Ali...");
			System.out.println("Me Ali...");
			break;

		default:
			System.out.println("we dont supprt this browser..");
			break;
		}

	}

}
