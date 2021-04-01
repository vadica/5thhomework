object WallService {

    var posts = emptyArray<Post>()


    fun add(post: Post): Post {
        val copy: Post
        if (posts.isEmpty()){
            copy = post.copy(id = 1)
        } else{
            copy = post.copy(id = posts.last().id + 1)
        }
        posts += copy
        return copy
    }

    fun update(post: Post): Boolean{

        posts.forEachIndexed { index, onePost ->
            if (posts[index].id == post.id) {
                val copy = Post(
                    id = post.id,
                    ownerId = post.ownerId,
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    date = post.date,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    commentsCount = post.commentsCount,
                    likesCount = post.likesCount,
                    copyright = post.copyright,
                    repostsCount = post.repostsCount,
                    viewsCount = post.viewsCount,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId,
                    markedAsAds = post.markedAsAds
                )
                posts[index] = copy
                return true
            }
        }
        return false

    }

}