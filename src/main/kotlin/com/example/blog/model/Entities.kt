package com.example.blog.model

import com.example.blog.extensions.toSlug
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Article(
    var title: String,
    var headline: String,
    var content: String,
    @ManyToOne var author: User,
    var slug: String = title.toSlug(),
    var addedAt: LocalDateTime = LocalDateTime.now(),
    @Id @GeneratedValue var id: Long? = null
)

@Entity
class User(
    var login: String,
    var firstName: String,
    var lastName: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null
)

