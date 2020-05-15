# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.batch_id import BatchId  # noqa: E501
from openapi_server.models.batch_response import BatchResponse  # noqa: E501
from openapi_server.models.inline_response400 import InlineResponse400  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBatchController(BaseTestCase):
    """BatchController integration test stubs"""

    def test_batch_cancel(self):
        """Test case for batch_cancel

        Cancel Batch
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/{batch_id}/cancel'.format(batch_id='batch_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_batch_close(self):
        """Test case for batch_close

        Close Batch
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/batch/{batch_id}/close'.format(batch_id='batch_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_batch_create(self):
        """Test case for batch_create

        Initiate Batch
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'rule': 'rule_example',
            'user_agent': 'user_agent_example',
            'user_data': 'user_data_example',
        }
        response = self.client.open(
            '/file/batch',
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_batch_signed_result(self):
        """Test case for batch_signed_result

        Download Signed Batch Result
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/batch/{batch_id}/certificate'.format(batch_id='batch_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_batch_status(self):
        """Test case for batch_status

        Status of Batch Analysis
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/batch/{batch_id}'.format(batch_id='batch_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
