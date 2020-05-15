# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.analysis_result import AnalysisResult  # noqa: E501
from openapi_server.models.inline_response20010 import InlineResponse20010  # noqa: E501
from openapi_server.models.inline_response2008 import InlineResponse2008  # noqa: E501
from openapi_server.models.inline_response2009 import InlineResponse2009  # noqa: E501
from openapi_server.models.inline_response400 import InlineResponse400  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAnalysisController(BaseTestCase):
    """AnalysisController integration test stubs"""

    def test_analysis_rules(self):
        """Test case for analysis_rules

        Fetching Available Analysis Rules
        """
        headers = { 
            'Accept': 'application/json',
            'user_agent': 'user_agent_example',
        }
        response = self.client.open(
            '/file/rules',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_file_analysis_cancel(self):
        """Test case for file_analysis_cancel

        Cancel File Analysis
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/{data_id}/cancel'.format(data_id='data_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_file_analysis_get(self):
        """Test case for file_analysis_get

        Fetch Analysis Result
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/{data_id}'.format(data_id='data_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("application/octet-stream not supported by Connexion")
    def test_file_analysis_post(self):
        """Test case for file_analysis_post

        Analyze File
        """
        body = (BytesIO(b'some file data'), 'file.txt')
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/octet-stream',
            'apikey': 'apikey_example',
            'filename': 'filename_example',
            'filepath': 'filepath_example',
            'user_agent': 'user_agent_example',
            'rule': 'rule_example',
            'workflow': 'workflow_example',
            'batch': 'batch_example',
            'archivepwd': 'archivepwd_example',
            'metadata': 'metadata_example',
            'callbackurl': http://10.0.1.100:8081/listenback,
        }
        response = self.client.open(
            '/file',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/octet-stream')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sanitized_file(self):
        """Test case for sanitized_file

        Download Sanitized Files
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/converted/{data_id}'.format(data_id=8101abae27be4d63859c55d9e0ed0135),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_webhook_status(self):
        """Test case for webhook_status

        Query webhook status
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
        }
        response = self.client.open(
            '/file/webhook/{data_id}'.format(data_id='data_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
