package com.dragontalker.maven;
import static junit.framwork.Assert.assertEquals;
import org.junit.Test;

public class MakeFriendsTest {
	@Test
	public void testMakeFriends() {
		MakeFriends makeFriend = new MakeFriends();
		String str = makeFriend.makeFriends("litingwei");
		assertEquals("Hey,John make a friend please.", str);
	}
}
