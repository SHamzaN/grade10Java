//package AP.twoDArrays.Labs;
//
//public class TicTacToe
//{
//	private char[][] mat;
//
//	public TicTacToe()
//   {
//          mat = new char[3][3];
//   }
//
//	public TicTacToe(String game)
//	{
//		mat = new char[3][3];
//		int count = 0;
//		for (int i = 0; i < 3; i++)
//		{
//			for (int j = 0; j < 3; j++)
//			{
//				if(count < game.length())
//				{
//					mat[i][j] = game.charAt(count);
//				}
//				count++;
//			}
//		}
//	}
//
//	public String getWinner()
//	{
//		for (int i = 0; i < mat.length; i++)
//		{
//                if(mat[0][0] == 'X' && mat[0][1] == 'X' && mat[0][2] == 'X')
//				{
//					return "X wins horizontally!";
//				}
//
//                if (mat[0][0] == 'O' && mat[0][1] == 'O' && mat[0][2] == 'O')
//				{
//					return "O wins horizontally";
//				}
//
//                if (mat[1][0] == 'X' && mat[1][1] == 'X' && mat[1][2] == 'X')
//                {
//					return "X wins horizontally!";
//				}
//
//			    if (mat[1][0] == 'O' && mat[1][1] == 'O' && mat[1][2] == 'O')
//			    {
//				return "O wins horizontally!";
//			    }
//
//			    if (mat[2][0] == 'X' && mat[2][1] == 'X' && mat[2][2] == 'X')
//			    {
//				return "X wins horizontally!";
//			    }
//
//			    if (mat[2][0] == 'O' && mat[2][1] == 'O' && mat[2][2] == 'O')
//			    {
//				return "O wins horizontally!";
//			    }
//
//			    if(mat[0][0] == 'X' && mat[1][0] == 'X' && mat[2][0] == 'X')
//			   {
//				return "X wins vertically!";
//			   }
//
//			 if (mat[0][0] == 'O' && mat[1][0] == 'O' && mat[2][0] == 'O')
//			 {
//				return "O wins vertically!";
//			 }
//
//			if (mat[0][1] == 'X' && mat[1][1] == 'X' && mat[2][1] == 'X')
//			{
//				return "X wins vertically!";
//			}
//
//			if (mat[0][1] == 'O' && mat[1][1] == 'O' && mat[2][1] == 'O')
//			{
//				return "O wins vertically!";
//			}
//
//			if (mat[0][2] == 'X' && mat[1][2] == 'X' && mat[2][2] == 'X')
//			{
//				return "X wins vertically!";
//			}
//
//			if (mat[0][2] == 'O' && mat[1][2] == 'O' && mat[2][2] == 'O')
//			{
//				return "O wins vertically!";
//			}
//
//			if (mat[0][0] == 'X' && mat[1][1] == 'X' && mat[2][2] == 'X')
//			{
//				return "X wins diagonally!";
//			}
//
//			if (mat[0][2] == 'X' && mat[1][1] == 'X' && mat[2][0] == 'X')
//			{
//				return "X wins diagonally!";
//			}
//
//			if (mat[0][0] == 'O' && mat[1][1] == 'O' && mat[2][2] == 'O')
//			{
//				return "O wins diagonally!";
//			}
//
//			if (mat[0][2] == 'O' && mat[1][1] == 'O' && mat[2][0] == 'O')
//			{
//				return "O wins diagonally!";
//			}
//		}
//		return "cat's game -no winner!";
//	}
//
//	public String toString()
//	{
//		StringBuilder output= new StringBuilder();
//
//		for(int i =0;i < mat.length; i++)
//		{
//			for(int j = 0; j < mat[i].length;j++)
//			{
//				output.append(" ").append(mat[i][j]);
//			}
//			output.append("\n");
//		}
//		return output.append(" ").append(getWinner()) +"\n\n";
//	}
//}