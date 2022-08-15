package me.mrbluesky.pigeonpractice.core.entity

import me.mrbluesky.pigeonpractice.core.base.BaseEntity
import org.hibernate.annotations.GenericGenerator
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "transaction_log")
data class TransactionLog (
    @Id
    @GeneratedValue(generator = "txId")
    @GenericGenerator(name = "txId", strategy = "me.mrbluesky.pigeonpractice.core.CustomTxIdGenerator")
    @Column(name = "tx_id")
    val transactionId: String,

    @Column(name = "tx_header")
    val transactionHeader: String,

    @Column
    val transactionBody: String
) : BaseEntity()


/*
create table transaction_log
(
    tx_id       varchar(36) not null,
    tr_header   text        null,
    tr_body     text        null,
    created_at  datetime    not null,
    creator_id  varchar(5)  not null,
    modified_at datetime    not null,
    modifier_id varchar(5)  not null,
    constraint transaction_log_pk
        primary key (tx_id)
);
 */