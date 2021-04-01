import org.junit.Assert.*
import org.junit.Test

class MainKtTest {
    var post = Post(
        0,
        0,
        0,
        0,
        "20 / 12 / 2020",
        "post first",
        0,
        0,
        false,
        0,
        0,
        "copiright",
        0,
        0,
        "post",
        0,
        false,
        false,
        false,
        false,
        false,
        0,
        false
    )

    @Test
    fun addPost() {
        WallService.add(post)
        assertTrue(WallService.posts.last().id > 0)
    }

    @Test
    fun updateExisting() {
        post = Post(
            1,
            0,
            0,
            0,
            "20 / 12 / 2020",
            "post first",
            0,
            0,
            false,
            0,
            0,
            "copiright",
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            0,
            false
        )
        WallService.add(post)
        assertTrue(WallService.update(post))

    }

    @Test
    fun updateUnexisting() {

        val postUpdate = Post(
            9,
            0,
            0,
            0,
            "20 / 12 / 2020",
            "post first",
            0,
            0,
            false,
            0,
            0,
            "copiright",
            0,
            0,
            "post",
            0,
            false,
            false,
            false,
            false,
            false,
            0,
            false
        )

        WallService.add(post)
        assertFalse(WallService.update(postUpdate))

    }


}