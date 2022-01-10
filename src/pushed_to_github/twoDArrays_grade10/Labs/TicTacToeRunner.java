//package AP.twoDArrays.Labs;
//import java.util.Scanner;
//import static java.lang.System.*;
//import java.io.File;
//import java.io.IOException;
//
//public class TicTacToeRunner
//{
//	public static final String TIC_TAC_TOE_DAT = "TicTacToe.dat";
//
//	public static void main(String[] args) throws IOException
//	{
//
//		Scanner file = new Scanner( new File(TIC_TAC_TOE_DAT));
//		int size = file.nextInt();
//
//		for (int i = 0; i <= size; i++)
//		{
//			String inputGame = file.nextLine();
//			if(!inputGame.equals(""))
//			{
//				TicTacToe ticToeToe = new TicTacToe(inputGame);
////				ticToeToe.getWinner();
//				out.print(ticToeToe);
//			}
//		}
//	}
//}