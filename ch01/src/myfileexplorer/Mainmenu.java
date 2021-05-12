package myfileexplorer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mainmenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("파일 메뉴");
			System.out.println("1. 파일복사 2. 파일/디렉토리 삭제 3.파일 내용 디스플레이 4.디렉토리 리스팅 5.파일or디렉토리 압축 6.파일 자바 swing 선택 삭제 7.종료");
			m = sc.nextInt();

			switch (m) {
			case 1:
				try {
					Fcopy();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // file copy
				break;

			case 2:
				System.out.println("input d file or dir address");
				String dadd = sc.next();
				deleteFolder(dadd);// file/dir delete
				break;

			case 3:
				// file contents display
				System.out.println("-h, -t, -c");
				String m2;
				m2 = sc.next();
				if (m2.equals("-h")) {// -h file f 5 line display
					try {
						read5linetest();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else if (m2.equals("-t")) {
					// -t file l 5 line display
					try {
						printByRandomAcessFile();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else if (m2.equals("-c")) {
					// -c file l num,char num,str num display
					try {
						plwc();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					break;
				}
				break;

			case 4:
				// dir listing
				System.out.println("-l, -r, else");
				String m3;
				m3 = sc.next();
				if (m3.equals("-l")) {
					pfdlist_l();
				} else if (m3.equals("-r")) {
					System.out.println("inputfileaddress");
					String str = sc.next();
					File in = new File(str);
					pfdlist_r(in);
				} else {
					System.out.println("inputfileaddress");
					String str = sc.next();
					pfdlist(str);
				}
				break;

			case 5:
				// file and dir compress
				System.out.println("input file or dir address");
				String ca = sc.next();
				System.out.println("input destination file");
				String da = sc.next();

				File ch = new File(ca);

				if (ch.isDirectory()) {
					try {
						System.out.println("exezipp");
						zipDirectory(ca, da);
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					try {
						gzipFile(ca, da);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;

			case 6:
				System.out.println("input file or dir path");
				String sadd = sc.next();
				new DeleteFile(sadd);
			}
			if (m == 7) {
				break;
			}
		}
	}

	public static void Fcopy() throws IOException {
		Scanner s = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		try {
			System.out.println("enter a source file which exists");
			String file1 = s.next();
			File f1 = new File(file1);
			fr = new FileReader(f1);
			System.out.println("enter a destination file");
			String file2 = s.next();

			File f2 = new File(file2);
			if (!f2.exists()) {
				fw = new FileWriter(file2);
				f2.createNewFile();
				int c = fr.read();
				while (c != -1) {
					fw.write(c);
					c = fr.read();
				}
				fr.close();
				System.out.println("file copied successfully");
			} else {

				System.out.println("do you want to overwrite? enter 'yes' or 'no'...");
				char ans = s.next().charAt(0);

				if (ans == 'N' || ans == 'n') {
					fr.close();
					// fw.close();
					System.out.println("couldnot enter data");
				} else {
					fw = new FileWriter(file2);
					int c = fr.read();
					while (c != -1) {
						fw.write(c);
						c = fr.read();
					}
					fr.close();
					System.out.println("file updated successfully");
				}
			}
		} catch (IOException e) {
			System.out.println("file coudn't be found");
		} finally {
			close(fr);
			close(fw);
			// fw.close();
		}
	}

	public static void close(Closeable stream) {
		try {
			if (stream != null) {
				stream.close();
			}
		} catch (IOException e) { // ...
			e.printStackTrace();
		}
	}

	public static void deleteFolder(String path) {

		File folder = new File(path);
		try {
			if (folder.isFile()) {
				folder.delete();
			} else if (folder.exists()) {
				File[] folder_list = folder.listFiles(); // 파일리스트 얻어오기

				for (int i = 0; i < folder_list.length; i++) {
					if (folder_list[i].isFile()) {
						folder_list[i].delete();
						System.out.println("파일이 삭제되었습니다.");
					} else {
						deleteFolder(folder_list[i].getPath()); // 재귀함수호출
						System.out.println("폴더가 삭제되었습니다.");
					}
					folder_list[i].delete();
				}
				folder.delete(); // 폴더 삭제
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static void read5linetest() throws IOException {
		System.out.println("input file address");
		Scanner sc = new Scanner(System.in);
		String fadd = sc.next();
		File file = new File(fadd);
		if (file.exists()) {
			BufferedReader inFile = new BufferedReader(new FileReader(file));
			String sLine = null;
			for (int i = 0; i < 5; i++) {
				sLine = inFile.readLine();
				System.out.println(sLine);
			}
		}
	}

	public static void printByRandomAcessFile() throws IOException {
		System.out.println("input file address");
		Scanner sc = new Scanner(System.in);
		String fadd = sc.next();
		File file = new File(fadd);
		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
		int lines = 0;
		StringBuilder builder = new StringBuilder();
		long length = file.length();
		length--;
		randomAccessFile.seek(length);
		for (long seek = length; seek >= 0; --seek) {
			randomAccessFile.seek(seek);
			char c = (char) randomAccessFile.read();
			builder.append(c);
			if (c == '\n') {
				builder = builder.reverse();
				System.out.println(builder.toString());
				lines++;
				builder = null;
				builder = new StringBuilder();
				if (lines == 5) {
					break;
				}
			}

		}
	}

	public static void plwc() throws IOException {
		File file = new File("C:\\Users\\zkxkr\\iCloudDrive\\금오공대3-1\\프로그래밍응용\\과제\\fileprogram\\stext.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		String line;

		// Initializing counters
		int countWord = 0;
		int sentenceCount = 0;
		int characterCount = 0;

		// Reading line by line from the
		// file until a null is returned
		while ((line = reader.readLine()) != null) {
			{
				characterCount += line.length();

				// \\s+ is the space delimiter in java
				String[] wordList = line.split("\\s+");

				countWord += wordList.length;

				// [!?.:]+ is the sentence delimiter in java
				String[] sentenceList = line.split("[!?.:]+");

				sentenceCount += sentenceList.length;
			}
		}

		System.out.println("Total word count = " + countWord);
		System.out.println("Total number of sentences = " + sentenceCount);
		System.out.println("Total number of characters = " + characterCount);

	}

	public static void pfdlist(String fadd) {
		// C:\디렉토리 아래 있는 파일 또는 디렉토리 목록을 얻어 도스 콘솔에 출력하세요.
		// File클래스의 list(), listFiles()메소드 이용.

		String dirName = fadd;
		File dir = new File(dirName);
		// String files[] = dir.list();
		// 디렉토리의 파일목록(디렉토리포함)을 String배열로 반환

		/*
		 * for(String fn : files) //확상for문 ; for -each문 System.out.println(fn);
		 */

		/*
		 * for(int i=0; i<files.length;i++){ System.out.println(files[i]); }
		 */

		File[] files2 = dir.listFiles();
		// 디렉토리의 파일목록(디렉토리포함)을 File 배열로 반환
		for (File f : files2) {
			String str = f.getName();

			if (f.isDirectory()) {
				System.out.print(str + "\t");
				System.out.println("DIR\n");
			} else { // 파일인 경우 ... txt파일만 출력.
				if (str.endsWith(".txt")) {
					System.out.println(str + "\t");
				}

			}

		} // for-------

	}

	public static void pfdlist_l() {
		// C:\디렉토리 아래 있는 파일 또는 디렉토리 목록을 얻어 도스 콘솔에 출력하세요.
		// File클래스의 list(), listFiles()메소드 이용.

		String dirName = "C:\\\\Users\\\\zkxkr\\\\iCloudDrive\\\\금오공대3-1\\\\프로그래밍응용\\\\과제\\\\fileprogram";
		File dir = new File(dirName);
		// String files[] = dir.list();
		// 디렉토리의 파일목록(디렉토리포함)을 String배열로 반환

		/*
		 * for(String fn : files) //확상for문 ; for -each문 System.out.println(fn);
		 */

		/*
		 * for(int i=0; i<files.length;i++){ System.out.println(files[i]); }
		 */

		File[] files2 = dir.listFiles();
		// 디렉토리의 파일목록(디렉토리포함)을 File 배열로 반환
		for (File f : files2) {
			{
				String str = f.getName();
				long lastModified = f.lastModified();
				String pattern = "yyyy-MM-dd hh:mm aa";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

				Date lastModifiedDate = new Date(lastModified);
				int pos = str.lastIndexOf(".");
				String ext = str.substring(pos + 1);

				System.out
						.println(str + " " + simpleDateFormat.format(lastModifiedDate) + " " + ext + " " + f.length());
			}
		}

	} // for-------

	public static void pfdlist_r(File tf) {
		// C:\디렉토리 아래 있는 파일 또는 디렉토리 목록을 얻어 도스 콘솔에 출력하세요.
		// File클래스의 list(), listFiles()메소드 이용.

		// String files[] = dir.list();
		// 디렉토리의 파일목록(디렉토리포함)을 String배열로 반환

		/*
		 * for(String fn : files) //확상for문 ; for -each문 System.out.println(fn);
		 */

		/*
		 * for(int i=0; i<files.length;i++){ System.out.println(files[i]); }
		 */

		File[] files2 = tf.listFiles();
		// 디렉토리의 파일목록(디렉토리포함)을 File 배열로 반환
		for (File f : files2) {
			String str = f.getName();

			if (f.isDirectory()) {
				System.out.println(str + "\t");
				System.out.println("intosubdir");
				pfdlist_r(f);

			} else { // 파일인 경우 ... txt파일만 출력.
				if (str.endsWith(".txt")) {
					System.out.println(str + "\t");
				}

			}

		} // for-------
		System.out.println("outdir");
	}

	public static void gzipFile(String src, String dest) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(src));

		BufferedOutputStream out =

				new BufferedOutputStream(

						new GZIPOutputStream(

								new FileOutputStream(dest)));

		System.out.println("Writing file");

		int c;

		while ((c = in.read()) != -1)

			out.write(c);

		in.close();

		out.close();

	}

	public static void zipDirectory(String directory, String zipFile) throws IOException, IllegalArgumentException {
		File sdir = new File(directory);
		File[] filesls = sdir.listFiles();
		byte[] buf = new byte[128];
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));
		for (File f : filesls) {
			if (f.isDirectory() != true) {
				FileInputStream in = new FileInputStream(f);

				String fileName = f.getName().toString();

				ZipEntry ze = new ZipEntry(fileName);
				out.putNextEntry(ze);

				int len;
				while ((len = in.read(buf)) > 0) {
					out.write(buf, 0, len);
				}

				out.closeEntry();
				in.close();
			}
		}
		out.close();
	}

}

class DeleteFile extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFileChooser fc;
	JButton b, btndel;
	JLabel l;
	JTextField tf;

	DeleteFile(String sadd) {
		super("Delete Directory");
		fc = new JFileChooser(sadd);
		l = new JLabel("dname");
		l.setBounds(25, 22, 35, 35);
		add(l);
		tf = new JTextField();
		tf.setBounds(100, 25, 120, 25);
		add(tf);
		b = new JButton("Browse");
		b.setBounds(250, 25, 80, 25);
		add(b);
		b.addActionListener(this);
		btndel = new JButton("Delete");
		btndel.setBounds(250, 100, 80, 25);
		add(btndel);
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btndel) {
					String text = tf.getText();
					System.out.println(text);
					File del = new File(sadd + "\\" + text);
					delete(del);
				}
			}
		});
		setLayout(null);
		setSize(400, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			int x = fc.showOpenDialog(null);
			if (x == JFileChooser.APPROVE_OPTION) {
				File f1 = fc.getSelectedFile();
				String s1 = fc.getName(f1);
				tf.setText(s1);
				File f2 = fc.getCurrentDirectory();
				String s2 = fc.getName(f2);
			}
		}
	}

	public void delete(File file) {
		if (file.isFile()) {

			file.delete();
			System.out.println("yes");
		} else {
			
			System.out.println("not a file");
		}
	}
}