package me.mrbluesky.pigeonpractice.core.base

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class BaseEntity: BaseObject() {
    @Column(name = "created_at")
    var createdAt: LocalDateTime? = null

    @Column(name = "creator_id")
    var creatorId: String? = null

    @Column(name = "modified_at")
    var modifiedAt: LocalDateTime? = null

    @Column(name = "modifier_id")
    var modifierId: String? = null
}