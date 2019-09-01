package JavapPerUtil;

public class CountWordsNum {
	
	/**
	 * 统计输入的文字中有多少个单词
	 * */
	public static int wordsNum(String wo){	
		
        int count = 0;                      // 记录单词个数  
        String str = wo.trim();  // trim()：忽略字符串头部和尾部的空白
        String[] words = str.split(" ");    // split(): 根据给定正则表达式的匹配拆分此字符串
        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals("")) {      // 去除 words数组中为空的元素
                count++;
            }
        }
       
        return count;		
	}

}	
